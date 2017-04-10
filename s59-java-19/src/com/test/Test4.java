package com.test;

import java.lang.reflect.Field;

public class Test4 {

	public static void main(String[] args) throws InstantiationException,
			IllegalAccessException, ClassNotFoundException,
			NoSuchFieldException, SecurityException {

		Class c = Class.forName("com.pojo.Student");
		Field[] fields = c.getFields();
		for (Field field : fields) {
			System.out.println(field.getName());
		}
	}
}
