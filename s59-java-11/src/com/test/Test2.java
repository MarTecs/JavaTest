package com.test;

public class Test2 {

	public static void main(String[] args) {

		// try �������쳣�Ĵ���
		// catch ����쳣�Ĵ���
		try {
			System.out.println("a");
			Class.forName("com.test.Test");//  ������
			System.out.println("b");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("c");
		}

	}

}
