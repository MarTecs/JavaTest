package com.test;

import java.util.ArrayList;
import java.util.List;

public class Test4 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("aa");
		list.add("bb");
		list.add("aa");
		list.add("cc");
		list.add("dd");
		
		
		list.remove("aa");
		list.remove(0);
		System.out.println(list.size());
		System.out.println(list.get(0));
		
		
		
		
		

	}

}
