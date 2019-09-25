package com.June06;

public class Lesson4{

public static void main(String[] args){
int a=4;
float b=2f;
char c='c';

//关系运算
System.out.println("关系运算");
System.out.println("a==b  " +(a==b));
System.out.println("a!=b  " +(a!=b));
System.out.println("a>b  " +(a>b));
System.out.println("a<b  " +(a<b));
System.out.println("a!=c  " +(a!=c));
System.out.println("a==c  " +(a==c));

//逻辑运算
System.out.println("逻辑运算");
System.out.println("(a==b)&&(a!=c)  " +((a==b)&&(a!=c)));
System.out.println("(a!=c)&&(a==b)  " +((a!=c)&&(a==b)));
System.out.println("(a!=b)&&(a!=c)  " +((a!=b)&&(a!=c)));
System.out.println("(a<b)&&(a==b)  " +((a<b)&&(a==b)));
System.out.println("(a!=b)||(a!=c)  " +((a!=b)||(a!=c)));
System.out.println("(a>b)||(a==b)  " +((a>b)||(a==b)));
System.out.println("(a==b)||(a>b)  " +((a==b)||(a>b)));
System.out.println("(a<b)||(a==b)  " +((a<b)||(a==b)));
System.out.println("a>b  " +(a>b));
System.out.println("a<b  " +(a<b));
System.out.println("a!=c  " +(a!=c));
System.out.println("a==c  " +(a==c));
}}