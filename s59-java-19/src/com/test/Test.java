package com.test;

import com.pojo.Student;

public class Test {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		Class c = Student.class;
		//ʵ����
		Student student = (Student) c.newInstance();
		student.setStuid(1);
		System.out.println(student.getStuid());
		

	}

}
