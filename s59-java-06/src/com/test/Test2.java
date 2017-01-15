package com.test;

public class Test2 {

	int age = 10;

	public static void main(String[] args) {

		Test2 test2 = new Test2();
		Test2 test22 = test2 ;
		System.out.println(test22.age);
		
		System.out.println(test2.hashCode());
		System.out.println(test22.hashCode());
		
		test2.age = 20 ;
		System.out.println(test22.age);
	}

}
