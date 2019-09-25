package com.June26;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class JkbcConnection {
	static File f=new File("D:/insert1.sql");
	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter(f);
		int age=19;
		for (int i=1;i<51;i++){
			String str="insert into student(name,id,age,height,weight)values('Matthew',"+i+","+age+","+1+(i+40)+"."+age+","+(i+40)+"."+age+")";
			age++;
			fw.write(str);
		}
	}

}
