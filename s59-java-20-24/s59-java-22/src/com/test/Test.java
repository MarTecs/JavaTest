package com.test;

public class Test {

	public static void main(String[] args) {
		SingleTon singleTon = SingleTon.getInstance();
		SingleTon singleTon2 = SingleTon.getInstance();
		System.out.println(singleTon == singleTon2);
	}

}
