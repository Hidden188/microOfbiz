package com.June17;

public class work2 {

	public static void me(String a, String b) {
		if (a.length() > b.length()) {
			System.out.println(a + "比" + b + "大");
		} else if (a.length() < b.length()) {
			System.out.println(a + "比" + b + "小");
		} else
			System.out.println(a + "等于" + b);
	}

	public static void main(String[] args) {
		me("A", "B");
		me("A", "A1");
		me("ABC", "BCD");
	}
}
