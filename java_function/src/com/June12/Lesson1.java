package com.June12;

public class Lesson1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 数组：相同类型的若干个数据组成的集合，数组的变量是引用类型
		 * 声明数组格式：类型 数组名字[]；
		 * 
		 */
		int a[]={1,2,54,6};//声明了一个名为a的数组，里面存储int类型数据.并且初始化
		System.out.println(a[3]);
		MyPoint points[];
		
		points=new MyPoint[4];
		MyPoint p1=new MyPoint(1,1);
		MyPoint p2=new MyPoint(2,1);
		MyPoint p3=new MyPoint(3,3);
		MyPoint p4=new MyPoint(4,2);
		
		//赋值：数组名字[下标位置]=要赋的值
		points[0]=p3;
		points[1]=p4;
		points[2]=p1;
		points[3]=p2;
		
		//数组取值：数组名字[下表位置]
		System.out.println(points[1].toString());
		
		//创建一个数组，类型是float
		
		float t[]={1.4f,3.5f,6.5f,9.0f,0.43f};
		System.out.println(t[3]);
		for(int i=0;i<t.length;i++){
			System.out.println("第"+i+"个是："+t[i]);
		}
		//jdk5.0开始提供了更好的for循环写法
		for(float i:t){
			System.out.println(i);
		}
		
		
		
	}

}
