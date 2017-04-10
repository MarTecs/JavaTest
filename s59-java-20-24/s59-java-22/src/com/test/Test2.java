package com.test;

public class Test2 extends Thread {

	@Override
	public void run() {
		SingleTon singleTon = SingleTon.getInstance();
		System.out.println(singleTon);
	}

	public static void main(String[] args) {
		Test2 test2 = new Test2();
		test2.start();

		Test2 test22 = new Test2();
		test22.start();

	}

}
