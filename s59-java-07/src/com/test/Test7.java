package com.test;

public class Test7 {

	public static void main(String[] args) {

		String s = "a";
		s = s.concat("bc");
		System.out.println(s.equals("abc"));
		String s2 = "abc";
		System.out.println(s==s2);
		
		System.out.println(s2.startsWith("ab"));
		System.out.println("ABC".equals(s2));
		System.out.println("ABC".equalsIgnoreCase(s2));
		
	}
}
