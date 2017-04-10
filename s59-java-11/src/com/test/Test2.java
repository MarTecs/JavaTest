package com.test;

public class Test2 {

	public static void main(String[] args) {

		// try 可能有异常的代码
		// catch 解决异常的代码
		try {
			System.out.println("a");
			Class.forName("com.test.Test");//  加载类
			System.out.println("b");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("c");
		}

	}

}
