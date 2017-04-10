package com.test;

public class Test4 {

	public static void say() throws ClassNotFoundException {
		Class.forName("");
	}

	public static void main(String[] args) throws ClassNotFoundException {
		say();
	}

}
