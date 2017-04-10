package com.test;

public class Test3 {

	public static void main(String[] args) {

		try {
			Class.forName("aa");
															
			Test3 test3 = new Test3();
			Test3 test32 = (Test3) test3.clone();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("aa");

	}

}
