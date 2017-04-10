package com.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.pojo.Student;

public class Test8 {

	public static void main(String[] args) throws InstantiationException,
			IllegalAccessException, ClassNotFoundException,
			NoSuchFieldException, SecurityException, NoSuchMethodException,
			IllegalArgumentException, InvocationTargetException {

		Student student = new Student();
		Class c = student.getClass();

		Method[] methods = c.getMethods();
		for (Method method : methods) {
			System.out.println(method.getName());
		}

	}
}
