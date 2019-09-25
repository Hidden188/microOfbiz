package com.June10;

public class Test2 {//创建的时候已经执行这一行，不再main函数里执行
	private String name="自在";
	private int a=3;
	public Test2(){
		a =6;
		
	}
	
	
	public static void main(String[] args) {//程序入口
		// TODO Auto-generated method stub

		Test2 t2=new Test2();
		System.out.println(t2.name+"  "+t2.a);
		/*
		 * java类的基本运行顺序
		 * 1.程序入口 main方法
		 * 
		 */		
	}

}
