package com.test;

import java.io.File;

public class Test {
	
	public static void main(String[] args) {
		
		File file = new File("d:/a.txt");
		System.out.println(file.exists());
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());	
	}
}
