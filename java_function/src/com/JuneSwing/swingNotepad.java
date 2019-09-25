package com.JuneSwing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import net.mindview.util.*;
import static net.mindview.util.SwingConsole.*;

public class swingNotepad extends JFrame{
	private JButton b=new JButton("add text");
	private JTextPane tp=new JTextPane();
	private static Generator sg=new RandomGenerator.String(7);
	public swingNotepad(){
		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				for(int i=1;i<10;i++){
					tp.setText(tp.getText()+sg.next()+"\n");
				}
			}
		});
		add(new JScrollPane(tp));
		add(BorderLayout.SOUTH,b);
	}
	public static void main(String[] args){
		run(new swingNotepad(),475,425);
	}
}
