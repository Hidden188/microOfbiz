package com.June19;

public class Lesson1 {
	Lesson1 l1;
	int a=9;
	
	public static void main(String[] args){
		/*
		 * 1.创建一个抽象类TestAbstract，抽象方法showName，普通方法showId
		 * 2.创建一个接口TestInterface1，showAge
		 * 3.创建一个接口TestInterface2，showAge，showName
		 * 4.创建一个普通类Test，继承TestAbstract，实现两个接口Testface1与Testface2
		 */
		
		/*
		 * 异常
		 * 发生后就不再执行程序了
		 * try｛
		 * 可能会发生异常的代码
		 * ｝catch（Exception e1）｛
		 * 对类型为Exception1的异常处理
		 * ｝catch（Exception e2）｛
		 * 对类型为Exception2的异常处理
		 * ｝finally｛
		 * finally块表示无论是不是发生异常，都会运行这块代码
		 * ｝
		 * 1.try catch可以嵌套，里面的try找不到对应的exception catch的时候，会去外面的try catch找对应的exception catch
		 * 2.catch的exception类型范围，必须从小到大
		 * 
		 */
		int[] test={4,6,87};
		try{
			try{
				System.out.println(test[5]);
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("此处数组错误。");
			}
		System.out.println(2/0);
		}catch(ArithmeticException ae){
			System.out.println("分母不能为0");
		}finally{
			/*
			 * finally块表示，无论是否发生异常，都会运行这块代码。
			 * 1.关闭文件
			 * 2.关闭数据库结果集
			 * 3.关闭数据库连接
			 * 4.释放动态分布的内存
			 * 
			 */
			System.out.println("finally块表示，无论是否发生异常，都会运行这块代码。");
		}
		System.out.println("jing");
	}

}
