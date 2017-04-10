package com.test;

import com.pojo.Student;

public class Testa {

	public static void main(String[] args) {

		Class c = Student.class;
		Class[] c2 = c.getInterfaces();

		for (Class class1 : c2) {
			System.out.println(class1.getName());
		}

	}
}
