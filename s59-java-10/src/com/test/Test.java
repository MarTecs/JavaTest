package com.test;

import java.util.HashSet;
import java.util.Set;

public class Test {
	public static void main(String[] args) {

		Set set = new HashSet();

		set.add(1);
		set.add(4);
		set.add(2);
		set.add(8);
		set.add(6);
		set.add(6);

		for (Object object : set) {
			System.out.println(object);
		}

	}

}
