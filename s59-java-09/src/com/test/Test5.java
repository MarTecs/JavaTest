package com.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test5 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("aa");
		list.add("bb");
		list.add("aa");
		list.add("cc");
		list.add("dd");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));	
		}
		
		System.out.println("------------------------------------------------");
		
		
		for (String string : list) {
			System.out.println(string);
		}
		
		System.out.println("------------------------------------------------");
		
		
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		
		
		
			

	}

}
