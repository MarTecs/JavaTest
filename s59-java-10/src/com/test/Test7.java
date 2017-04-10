package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Test7 {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();

		list.add(1);
		list.add(7);
		list.add(3);
		list.add(2);

		for (Integer integer : list) {
			System.out.println(integer);
		}

		/*
		 * Collections.sort(list); for (Integer integer : list) {
		 * System.out.println(integer); }
		 */

		TreeSet<Integer> set = new TreeSet<Integer>(list);

		for (Integer integer : set) {
			System.out.println(integer);
		}
		
		
	}

}
