package com.June17;

import java.util.Scanner;

public class work00 {

	public static void main(String[] args) {
		System.out.println("请输入两个字符串：");
		String s1 = new Scanner(System.in).nextLine();
		String s2 = new Scanner(System.in).nextLine();
		System.out.println("第一个字符串排序后为:" + sortString(s1));
		System.out.println("第二个字符串排序后为:" + sortString(s2));
		StringBuilder s = new StringBuilder();
		System.out.println("两个字符串连接之后的排序为:" + sortString(s.append(s1).append(s2).toString()));
	}

	public static String sortString(String str) {
		char[] ch = str.toCharArray();
		for (int i = ch.length - 1; i > 0; i--)
			for (int j = 0; j < i; j++)
				if (ch[i] < ch[j]) {
					char temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
		return new String(ch);
	}
}
