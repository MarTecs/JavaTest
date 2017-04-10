package com.test;

import com.pojo.Student;

public class Test9 {

	public static void main(String[] args) {

		Class c = Student.class;
		Class c2 = c.getSuperclass();

		System.out.println(c2.getName());

	}
}
