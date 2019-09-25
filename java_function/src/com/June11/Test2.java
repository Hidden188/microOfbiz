package com.June11;

public class Test2 extends Parent {

	private float r = 22;

//	public test2() {
//		super(5);
//		r = 88;
//		System.out.println("这是子类的构造方法");
//		showName();
//		super.showName();
//		System.out.println("父类的属性b=" + super.b);
//	}

	public void showName() {
		System.out.println("这是子类的showName方法");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2 t2 = new Test2();
		//t2.test2();
		System.out.println("t2.r=" + t2.r);
		System.out.println("t2.b=" + t2.b);
	}

}
