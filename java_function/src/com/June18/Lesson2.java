package com.June18;
/*
 * 接口
 * 概念：java创建一个类，但是这个类的所以成员方法都是抽象的
 * 1.java只支持单继承，但可以实现多个接口；
 * 2.声明一个方法，期望有更多的类来实现这个方法
 * 3.暴露一个对象的编程接口，而不是暴露一个类的实际程序体
 * 
 * 接口和抽象类如何选择？
 * 1.优先使用接口，尽量少用抽象类
 * 2.需要定义子类的行为，又要为子类提供共性的功能。
 * 
 */

public interface Lesson2 {
	int a=1;
	/*
	 * 接口里面的方法都是抽象方法，默认为public abstract的，所有声明方法的时候，可以省略
	 * 一个子类只能继承一个父类，但接口可以实现多个
	 */
	public void test();
	public boolean send(int level,String moblieNumber,String message);
	
}
