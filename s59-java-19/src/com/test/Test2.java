package com.test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import com.pojo.Student;

public class Test2 {

	public static void main(String[] args) throws InstantiationException,
			IllegalAccessException, ClassNotFoundException,
			NoSuchFieldException, SecurityException {

		Class c = Class.forName("com.pojo.Student");
		Field field = c.getDeclaredField("stuid");
		System.out.println(field.getName() + "\t"
				+ Modifier.toString(field.getModifiers()) + "\t"
				+ field.getType());

		Student student = (Student) c.newInstance();
		// student.setStuid(1);
		field.setAccessible(true);//设置私有属性可以访问
		field.set(student, 1);

		System.out.println(student.getStuid());

	}

}
