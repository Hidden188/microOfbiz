package com.June06;

/**
 * @author Administrator
 *
 */
public class Lesson5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 赋值运算
		int a;
		a=3;
		int b=6;
		b+=a;
		System.out.println("b的值是：" +b);
		int c=8;
		c-=a;
		System.out.println("c的值是：" +c);
		int d=9;
		d/=a;
		System.out.println("d的值是：" +d);
		int e=4;
		e*=a;
		System.out.println("e的值是：" +e);
		int g=12;
		System.out.println("十六进制：" +Integer.toHexString(g));
		System.out.println("二进制：" +Integer.toBinaryString(g));
		System.out.println("八进制：" +Integer.toOctalString(g));
	}

}
