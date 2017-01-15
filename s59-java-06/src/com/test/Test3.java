package com.test;

public class Test3 implements Cloneable {

	int age = 10;

	public static void main(String[] args) throws CloneNotSupportedException {

		Test3 test3 = new Test3();
		//克隆返回的是一个object对象
		Test3 test32 = (Test3) test3.clone();
		
		
		System.out.println(test3.hashCode());
		System.out.println(test32.hashCode());
		
		test3.age=20;
		System.out.println(test32.age);
		
	}

}
