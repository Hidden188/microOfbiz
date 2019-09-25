package com.June11;

public class Parent {
	private float a=88;
	int b=55;
	public Parent(){
		System.out.println("这是父类的构造方法");
	}
	
	public Parent(int a){
		this();
		System.out.println("这是父类的有璨构造方法");
	}
	
	public void showName(){
		System.out.println("这是父类的showName方法");
	}

}
