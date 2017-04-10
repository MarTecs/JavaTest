package com.test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import com.pojo.Student;

public class Test3 {

	public static void main(String[] args) throws InstantiationException,
			IllegalAccessException, ClassNotFoundException,
			NoSuchFieldException, SecurityException {

		Class c = Class.forName("com.pojo.Student");
		Field[] fields = c.getDeclaredFields();
		for (Field field : fields) {
			System.out.println(field.getName());
		}
		
		

	}

}
