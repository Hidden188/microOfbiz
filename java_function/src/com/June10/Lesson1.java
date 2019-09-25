package com.June10;

public class Lesson1 {

	int a=6;//定义值方法，类里面的变量叫成员变量
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * this 关键字的用法
		 * 1.获取成员变量
		 * 
		 */
		int a=9;
		test3();
		
	}

	//非静态方法，调用类里面的任何其他方法（不论是静态方法海事非静态方法），可以不需要new对象，直接通过方法名称调用。
	public void test(){
		int a=8;
		System.out.println("a=" +a);
		System.out.println("a2=" +this.a);//此处调用了成员变量
		test2();
		//test3();
	}
	
	public void test2(){
		System.out.println("test2 a="+a);
	}
	
	/**
	 * 静态方法调用非静态方法，必须new一个对象，通过对象去调用
	 *调用静态方法： 
	 *
	 */
	public static void test3(){
		//System.out.println(a);
		//test();
		//如何new一个对象？ 类名 对象名称=new 构造方法（）；
		Lesson1 l=new Lesson1();
		l.test();
		l.test2();
		test4();
		l.test4();
	}
	
	public static void test4(){
		System.out.println("It's test4");
	}
}
