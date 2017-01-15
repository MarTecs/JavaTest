package com.test;

public class Test5 {

	protected void finalize() throws Throwable {
		System.out.println("À¬»ø»ØÊÕÁË");
		super.finalize();
	} 

	public static void main(String[] args) {
		Test5 test5 = new Test5();
		test5 = new Test5();
		System.gc();
		System.out.println(test5.hashCode());

	}

}
