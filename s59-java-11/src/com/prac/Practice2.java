package com.prac;

public class Practice2 {

	public static void main(String[] args) {
		try {
			System.out.println(Class.forName("Practice1"));
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
			System.out.println("û���ҵ���������Ϣ!");
		}
	}
}
