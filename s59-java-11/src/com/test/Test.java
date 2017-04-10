package com.test;

import com.pojo.Student;

public class Test {

	public static void main(String[] args) {

			Student student = new Student();
			student.setStuid(1);
			student.setStuname("ÇØÊÙ");
		
		System.out.println(student.getStuid());
		System.out.println(student.getStuname());

	}
}
