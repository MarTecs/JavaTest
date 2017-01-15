package com.test;

public class Test16 {

	public static void main(String[] args) {

		String s = "abc";
		s = s + "de";
		s = s + "fg";
		System.out.println(s);

		StringBuffer sb = new StringBuffer("abc");
		sb.append("de");
		System.out.println(sb);
		
		String s2 = sb.toString();
		System.out.println(s2);
		
	}
}
