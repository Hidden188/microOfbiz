package com.June07;

import java.util.Scanner;

public class Test {	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Lesson2 l3 = new Lesson2();

		//数据类型：整型、引用（"abcd"）
		//关键字：
		//	
		
		
		System.out.println("hello world");
		float a = input.nextFloat();
		System.out.println("world");
		float b = input.nextFloat();

		System.out.println("鍔�" + l3.add(a, b));
		System.out.println("鍑�" + l3.substract(a, b));
		System.out.println("涔�" + l3.multiply(a, b));
		System.out.println("闄�" + l3.divide(a, b));
		System.out.println("鍙栦綑" + l3.remainder(a, b));
	}
}
