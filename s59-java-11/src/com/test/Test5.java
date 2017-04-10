package com.test;

public class Test5 {

	public static void main(String[] args) throws ClassNotFoundException {
		try {
			System.out.println("a");
			Class.forName("");
			System.out.println("b");
		} catch (Exception e) {
			System.out.println("c");
		}finally{
			System.out.println("c");
		}
	}

}
