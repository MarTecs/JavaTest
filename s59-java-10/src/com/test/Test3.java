package com.test;

import java.util.HashSet;
import java.util.Set;

import com.pojo.Student;

public class Test3 {
	public static void main(String[] args) {

		Set<Student> set = new HashSet<Student>();

		Student student = new Student();
		student.setStuid(1);
		student.setStuname("张三");

		Student student2 = new Student();
		student2.setStuid(1);
		student2.setStuname("张三");

		set.add(student);
		set.add(student2);

		System.out.println(set.size());

	}

}
