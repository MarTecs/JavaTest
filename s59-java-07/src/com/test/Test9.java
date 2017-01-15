package com.test;

public class Test9 {

	public static void main(String[] args) {

		String s = "abc";
		String s2 = new String("abc");
		System.out.println(s==s2);
		System.out.println(s==s2.intern());
		
		
		
	}
}
