package com.June12;

public class Lesson2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ถþฮฌสýื้
		 * 
		 */
		int a[][]={{4,3,5,1},{5,6}};
		int b[][];
		b=new int[4][];
		int[] temp=new int[6];
		temp[0]=44;
		temp[1]=4;
		temp[2]=77;
		b[0]=temp;
		b[1]=temp;
		b[2]=new int[4];
		for(int[] i:b){
			for(int j:i){
				System.out.println(j);
			}
		}
	}

}
