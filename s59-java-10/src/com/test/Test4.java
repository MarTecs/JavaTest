package com.test;

import java.util.TreeSet;

public class Test4 {
	public static void main(String[] args) {

		TreeSet set = new TreeSet();
		set.add("1");
		set.add("5");
		set.add("4");
		set.add("2");

		for (Object object : set) {
			System.out.println(object);
		}

	}

}
