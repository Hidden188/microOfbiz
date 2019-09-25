package com.JuneSwing;

import java.util.Date;
import java.util.Scanner;
import javax.swing.*;
import java.util.concurrent.*;
public class swing{

public static void main(String[] args){
	JFrame frame=new JFrame("hello swing");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE/*is closing*/);//how do when close button is clicking;
	frame.setSize(600, 400);
	frame.setVisible(true);//you can not see anything if no this code
		/*Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		switch (a) {
		case 10:
			System.out.println("û�д���case");
			break;
		case 44:
			System.out.println("������ȷ");
			break;
		default:
			System.out.println("û�д��ֽ��");
		}*/ 
	System.out.println("欢迎来到编程世界");
	System.out.println(new Date());
	}
}