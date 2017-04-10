package com.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.pojo.Student;

public class Test6 {

	public static void main(String[] args) throws InstantiationException,
			IllegalAccessException, ClassNotFoundException,
			NoSuchFieldException, SecurityException, NoSuchMethodException,
			IllegalArgumentException, InvocationTargetException {

		Student student = new Student();
		Class c = student.getClass();

		Method method = c.getDeclaredMethod("add", int.class, int.class);
		System.out.println(method.getName() + "\t" + method.getModifiers());

		int n = (Integer) method.invoke(student, 1, 2);
		System.out.println(n);

	}
}
