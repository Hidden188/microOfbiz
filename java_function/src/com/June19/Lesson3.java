package com.June19;

public class Lesson3 {

	public static void main(String[] args) throws Exception {
		/*
		 * throw
		 * 主动抛出异常
		 * 
		 */
		int a[]={4,5,6};
		try{
			System.out.println(a[5]);
		}catch (ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e.fillInStackTrace());
			
			throw new Exception("分母不能为0");
		}
	}

}
