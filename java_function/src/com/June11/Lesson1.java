package com.June11;

public class Lesson1 {
	int a=99;//对象实例级别
	static float b=88;//类级别
	private double c=55;//对象实例级别。
	
	static void test(float a){
		int g=77;//方法级别
		a=4;//方法级别
	}
	
	static void test2(Test t){
		t.name="t de breakfast";//方法级别
	}
	
	{
		int r=90;//块级别
		a=8;//对象实例级别
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*形参和实参
		 * 形参：定义方法的时候，用来标识输入参数类型
		 * 实参：调用方法的时候，实际传给方法的值
		 * 1.形参和实参，类型必须一致，或者符合隐含转换条件
		 * 2.形参是基本类型，调用方法的时候是值传递。方法执行的时候，形参和实参是不同的变量，存储在不同的内存位置。方法结束的时候，形参会被释放,实参不会受到影响。
		 * 3.形参是引用类型，调用方法的时候，传递的是内存地址的值
		 * 
		 */
		int a=7;//如果换成double就不可以了//a属于局部变量。方法级别
		Lesson1 l1=new Lesson1();//方法级别
		System.out.println("a1=" +l1.a);//static变量里不能直接用this，需要通过对象调用
		test(a);
		System.out.println("a=" +a);
		
		Test t1=new Test();//方法级别
		t1.name="t1 de breakfast";
		test2(t1);
		System.out.println("name=" +t1.name);
		
		/*变量的范围
		 * 1.类级别:全局变量，对象产生之前已经存在。被static修饰的
		 * 2.对象实例级别：成员变量，实例的属性
		 * 3.方法级别：局部变量，在方法里面定义的
		 * 4.块级别：定义在块里面的，变量的生命周期就是这个块，出了这个块，变量就被注销。
		 * 
		 */
	}

}
