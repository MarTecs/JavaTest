package com.test;

import java.util.TreeSet;

import com.pojo.Student;

public class Test5 {
	public static void main(String[] args) {

		TreeSet<Student> set = new TreeSet<Student>();

		Student student = new Student();
		student.setStuid(1);

		Student student2 = new Student();
		student2.setStuid(2);

		set.add(student);
		set.add(student2);

		for (Student s : set) {
			System.out.println(s.getStuid());
		}

	}

}
