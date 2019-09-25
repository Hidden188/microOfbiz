package com.June10;

public class Test {
	int c=9;
	
	//构造方法不能写void，它没有任何返回值
	public Test(){
		//this作为方法名称来初始化对象
		this(9);
		//this相当于方法名，
		this.test1();//代表当前对象
		System.out.println("这是无参构造方法");
	}
	
	public Test(int a){
		System.out.println("这是有参构造方法");
	}
	
	public void test1(){
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t=new Test();
		Test t2=new Test(4);
		
	}

}
