package com.test;

import java.util.TreeSet;

import com.pojo.Student;
import com.util.MySort;

public class Test6 {
	public static void main(String[] args) {

		TreeSet<Object> objects = new TreeSet<Object>(new MySort());

		Object object = new Object();
		Object object2 = new Object();

		objects.add(object);
		objects.add(object2);

		for (Object o : objects) {
			System.out.println(o);
		}

	}

}
