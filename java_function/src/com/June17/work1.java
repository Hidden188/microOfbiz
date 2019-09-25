package com.June17;

public class work1 {

	public static int counter(String s, String c) {
		int count = 0;
		while (s.indexOf(c) != -1) {
			count++;
			s = s.substring(s.indexOf(c) + c.length());
		}

		return count;
	}

	public static void main(String[] args) {
		// µÚÈıÌâ
		String en3 = "zizaitianyuan";
		System.out.println(counter(en3, "z"));
		System.out.println(counter(en3, "an"));
	}

}
