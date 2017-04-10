package com.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.pojo.Student;

public class Test7 {

	public static void main(String[] args) throws InstantiationException,
			IllegalAccessException, ClassNotFoundException,
			NoSuchFieldException, SecurityException, NoSuchMethodException,
			IllegalArgumentException, InvocationTargetException {

		Student student = new Student();
		Class c = student.getClass();

		Method[] methods = c.getDeclaredMethods();
		for (Method method : methods) {
			System.out.println(method.getName());
		}
		
		
	}
}
