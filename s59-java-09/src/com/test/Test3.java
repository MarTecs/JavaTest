package com.test;

import java.util.ArrayList;
import java.util.List;

public class Test3 {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("aa");
		list.add("bb");

		List<String> list2 = new ArrayList<String>();
		list2.add("cc");
		list2.add("dd");

		list.add(list2);
		System.out.println(list.size());
		list.addAll(list2);
		System.out.println(list.size());
		
		System.out.println(list.contains("aa"));
		
		list.clear();
		
		System.out.println(list.size());
		
		

	}

}
