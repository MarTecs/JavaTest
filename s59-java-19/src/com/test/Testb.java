package com.test;

public class Testb {

	public static int add(int a, int b) {

		try {
			Class.forName("com.pojo.Student");
			return a++ + b;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			System.out.println(a);
			return 10;
		}

	}

	public static void main(String[] args) {

		Testb testb = new Testb();
		int n = testb.add(1, 2);
		System.out.println(n);
		
		Testb testb2 = null ;
		int m = testb2.add(1, 2);
		System.out.println(m);
		
	}
}
