package com.test;

public class Test2 {

	public static void main(String[] args) {
		String s = "abc";// 放在常量池中
		String s2 = new String("abc");// 有new就在堆中
		
		System.out.println(s==s2);
		System.out.println(s.equals(s2));
		
		
	}
}
