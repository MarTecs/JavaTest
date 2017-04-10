package com.test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.pojo.Student;

public class Test5 {

	public static void main(String[] args) throws InstantiationException,
			IllegalAccessException, ClassNotFoundException,
			NoSuchFieldException, SecurityException, NoSuchMethodException {

		Student student = new Student();
		Class c = student.getClass();

		Method method = c.getDeclaredMethod("add", int.class, int.class);
		System.out.println(method.getName()+"\t" + method.getModifiers());
		
		
		
	}
}
