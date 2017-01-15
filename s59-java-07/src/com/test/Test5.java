package com.test;

public class Test5 {

	public static void main(String[] args) {
		String s = "a";
		String s3= "bc";
		String s4 = s+ s3 ;//运行时确定的值放堆中
		String s2 = "abc";
		
		System.out.println(s4==s2);
		System.out.println(s4.equals(s2));
		
	}
}
