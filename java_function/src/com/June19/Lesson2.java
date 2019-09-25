package com.June19;

public class Lesson2 {

	public static void main(String[] args) {
		/*
		 * try,catch,finally三个的关系
		 * 1.try不能单独使用，后面必须跟catch或finally
		 * 2.三种组合方式：try catch，try catch finally，try finally
		 * 3.try后面可以有多个catch，从上到下，范围必须从大到小
		 * 
		 */
		
		//非常严重的异常，如果发生就不应该继续执行
		try{
			System.out.println("2/0:"+2/0);
		}finally{
			System.out.println("welcome");
		}
		System.out.println("overcome");
		
	}

}
