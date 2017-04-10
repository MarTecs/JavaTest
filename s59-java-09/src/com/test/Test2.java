package com.test;

import java.util.ArrayList;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {
		// ·ºĞÍ
		List<String> list = new ArrayList<String>();
		list.add("aa");
		list.add("bb");
		list.add("cc");
		list.add(2,"dd");

		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		
	}

}
