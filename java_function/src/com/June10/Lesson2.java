package com.June10;

public class Lesson2 {
	
	
	private int a=88;
	public int year=2313;
	
	private void test1(int a){
		System.out.println("test1 a=" +a);
		a=9;
		System.out.println("test1 a1=" +a);
	}
	
	private void test2(Test t){
		System.out.println("test2 c="+t.c);
		t.c=33;
		System.out.println("test2 c=" +t.c);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*
	 *引用类型
	 *指向一个对象，在java中，除了基本类型，都是引用类型 
	 * 
	 */
		
		int b=77;
		Lesson2 l2=new Lesson2();//l2是引用类型的变量，
		/*
		 * 思考题：java中是值传递还是引用传递？课本里说是值传递
		 * 值传递：传递的参数值是，传递值的复制，就是说，传递之后，两个值互不关联了
		 * 引用类型传递也是值，是内存空间地址的值
		 * 所以java是按照值传递
		 */
		
		int a=99;
		l2.test1(a);
		System.out.println("test1 a=" +a);//此处a=99，因为上一行的a的值只是把99赋值过去
		
		Test t=new Test();
		
		t.c=77;
		
		Test t2=new Test();
		t=t2;
		t2.c=3;
		System.out.println("t之后="+t.c);
		
		l2.test2(t);
		System.out.println("main c=" +t.c);
		
		
		
	}

}
