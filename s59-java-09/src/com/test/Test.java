package com.test;

public class Test {

	public static void main(String[] args) {
		Student student = Student.getInstance();
		Student student2 = Student.getInstance();
		System.out.println(student == student2);

	}

}
