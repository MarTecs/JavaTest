package com.test;

public class Test2 {

	public static void main(String[] args) {
		String s = "abc";// ���ڳ�������
		String s2 = new String("abc");// ��new���ڶ���
		
		System.out.println(s==s2);
		System.out.println(s.equals(s2));
		
		
	}
}
