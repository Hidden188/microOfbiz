package com.June17;

public class work3 {

	public static void ch(StringBuilder s){
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='#')
				s.replace(i-1, i, "-");
		}
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		StringBuilder s=new StringBuilder();
		s.append("1#2#3#4#5");
		System.out.println(s);
		System.out.println(s.replace(0,s.length(), "1-2-3-4-5"));
		ch(s);
		}

}
