package org.base.start;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class Start {

	private Config config = null;
	private final List<String> loaderArgs = new ArrayList<>();
	private static final Start instance = new Start();
	private Thread adminPortThread = null;
	private final AtomicReference<ServerState> serverState = new AtomicReference<>(ServerState.STARTING);

	public static void main(String[] args) throws Exception {
		System.out.println("In The Begin");
		Command command = null;
		List<String> loaderArgs = new ArrayList<>(args.length);
		for (String arg : args) {
			if (arg.equals("-help") || arg.equals("-?")) {
				command = checkCommand(command, Command.HELP);
			} else if (arg.equals("-status")) {
				command = checkCommand(command, Command.STATUS);
			} else if (arg.equals("-shutdown")) {
				command = checkCommand(command, Command.SHUTDOWN);
			} else if (arg.equals("-")) {
				if (!arg.equals("-portoffset")) {
					command = checkCommand(command, Command.COMMAND);
				}
				loaderArgs.add(arg.substring(1));
			} else {
				command = checkCommand(command, Command.COMMAND);
				if (command == Command.COMMAND) {
					loaderArgs.add(arg);
				} else {
					command = Command.HELP_ERROR;
				}
			}
		}
		if (command == null) {
			command = Command.COMMAND;
			loaderArgs.add("start");
		}
		if (command == Command.HELP) {
			help(System.out);
			return;
		} else if (command == command.HELP_ERROR) {
			help(System.err);
			System.exit(1);
		}
		instance.init(args, command == Command.COMMAND);
		try {
			if (command == Command.STATUS) {
				System.out.println("Current status: " + instance.status());
			} else if (command == Command.SHUTDOWN) {
				System.out.println("Shutting down server : " + instance.shutDown());
			} else {
				instance.start();
			}
		} catch (Exception e) {
			System.exit(99);
		}
	}

	private enum Command {
		HELP, HELP_ERROR, STATUS, SHUTDOWN, COMMAND
	}

	private static Command checkCommand(Command command, Command wanted) {
		if (wanted == Command.HELP || wanted.equals(command)) {
			return wanted;
		} else if (command == null) {
			return wanted;
		} else {
			System.err.println("Duplicate Command detected(was " + command + ", wanted " + wanted);
			return Command.HELP_ERROR;
		}
	}

	private static void help(PrintStream out) {
		out.println("");
		out.println("Usage: java -jar ofbiz.jar [command] [arguments]");
		out.println("-both    -----> Run simultaneously the POS (Point of Sales) application and OFBiz standard");
		out.println("-help, -? ----> This screen");
		out.println("-install -----> Run install (create tables/load data)");
		out.println("-pos     -----> Run the POS (Point of Sales) application");
		out.println("-setup -------> Run external application server setup");
		out.println("-start -------> Start the server");
		out.println("-status ------> Status of the server");
		out.println("-shutdown ----> Shutdown the server");
		out.println("-test --------> Run the JUnit test script");
		out.println("[no config] --> Use default config");
		out.println("[no command] -> Start the server w/ default config");
	}

	void init(String[] args, boolean fullInit) throws Exception {
		String globalSystemPropsFileName = System.getProperty("ofbiz.system.props");
		if (globalSystemPropsFileName != null) {
			FileInputStream stream = null;
			try {
				stream = new FileInputStream(globalSystemPropsFileName);
				System.getProperties().load(stream);
			} catch (IOException e) {
				// TODO startupException
			} finally {
				if (stream != null) {
					try {
						stream.close();
					} catch (IOException e) {
						// TODO startupException
					}
				}
			}
		}
		try {
			this.config = new Config(args);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		if (args.length > 1) {
			this.loaderArgs.addAll(Arrays.asList(args).subList(1, args.length));
			try {
				if ("status".equals(args[0])) {
					System.out.println("Current status : " + instance.status());
				} else if ("stop".equals(args[0])) {
					System.out.println("Shutting down server : " + instance.shutDown());
				}
			} catch (Exception e) {
				e.printStackTrace();
				System.exit(99);
			}
		}
		if (!fullInit) {
			return;
		}
		createLogDirectory();
		createListenerThread();
		if (config.useShutdownHook) {
			Runtime.getRuntime().addShutdownHook(new Thread() {
				@Override
				public void run() {
					shutdownServer();
				}
			});
		}
	}

	private void createLogDirectory() {
		File logDir = new File(config.logDir);
		if (!logDir.exists()) {
			if (logDir.mkdir()) {
				System.out.println("Created OFBiz log dir [" + logDir.getAbsolutePath() + "]");
			}
		}
	}

	private void createListenerThread() throws Exception {
		if (config.adminPort > 0) {
			this.adminPortThread = new AdminPortThread();
			this.adminPortThread.start();
		} else {
			System.out.println("Admin socket not configured; set to port 0");
		}
	}

	void shutdownServer() {

	}

	private String status() {
		return "";
	}

	private enum Control {
		SHUTDOWN {
			@Override
			void processRequest(Start start, PrintWriter writer) {
				if (start.serverState.get() == ServerState.STOPPING) {
					writer.println("IN-PROGRESS");
				} else {
					writer.println("OK");
					writer.flush();
					start.stopServer();
				}
			}
		},
		STSTUS {
			@Override
			void processRequest(Start start, PrintWriter writer) {
				writer.println(start.serverState.get());
			}
		},
		FAIL {
			@Override
			void processRequest(Start start, PrintWriter writer) {
				writer.println("FAIL");
			}
		};

		abstract void processRequest(Start start, PrintWriter writer);
	}

	String sendSocketCommand(Control control) {
		return "";
	}

	private String shutDown() {
		return sendSocketCommand(Control.SHUTDOWN);
	}

	void start() {

	}

	private class AdminPortThread extends Thread {
		private ServerSocket serverSocket = null;

		AdminPortThread() {
			super("OFBiz-AdminPortThread");
			try {
				this.serverSocket = new ServerSocket(config.adminPort, 1, config.adminAddress);
			} catch (Exception e) {
				// TODO: handle exception
			}
			setDaemon(false);
		}

		private void processClientRequest(Socket client) throws IOException {
			BufferedReader reader = null;
			PrintWriter writer = null;
			try {
				reader = new BufferedReader(new InputStreamReader(client.getInputStream()));
				String request = reader.readLine();
				writer = new PrintWriter(client.getOutputStream(), true);
				Control control;
				if (request != null && !request.isEmpty() && request.contains(":")) {
					String key = request.substring(0, request.indexOf(':'));
					if (key.equals(config.adminKey)) {
						control = Control.valueOf(request.substring(request.indexOf(':') + 1));
						if (control == null) {
							control = Control.FAIL;
						}
					} else {
						control = Control.FAIL;
					}
				} else {
					control = Control.FAIL;
				}
				control.processRequest(Start.this, writer);
			} finally {
				if (reader != null) {
					reader.close();
				}
				if (writer != null) {
					writer.flush();
					writer.close();
				}
			}
		}

		@Override
		public void run() {
			System.out.println("Admin socket configured on - " + config.adminAddress + ":" + config.adminPort);
			while (!Thread.interrupted()) {
				try {
					Socket clientSocket = serverSocket.accept();
					System.out.println("Received connection from - " + clientSocket.getInetAddress() + " : "
							+ clientSocket.getPort());
					processClientRequest(clientSocket);
					clientSocket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	void stopServer() {
		shutdownServer();
		System.exit(0);
	}

	public enum ServerState {
		STARTING, RUNNING, STOPPING;

		@Override
		public String toString() {
			return name().charAt(0) + name().substring(1).toLowerCase();
		}
	}
}
