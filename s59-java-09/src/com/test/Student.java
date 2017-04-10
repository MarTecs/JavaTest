package com.test;

public class Student {

	private Student() {

	}

	static Student student = new Student();

	public static Student getInstance() {
		return student;
	}

}
