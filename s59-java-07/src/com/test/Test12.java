package com.test;

public class Test12 {

	public static void main(String[] args) {

		String s = "username:sunjob:aaa";
		String[] strings = s.split(":" , 4);
		for (int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
		}
	}
}
