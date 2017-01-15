package com.test;

public class Test7 {
	public static void main(String[] args) {
		Integer integer = 10;
		Integer integer2 = new Integer("10");

		System.out.println(integer == integer2);
		System.out.println(integer.hashCode());
		System.out.println(integer2.hashCode());
		
		System.out.println(integer.equals(integer2));

	}

}
