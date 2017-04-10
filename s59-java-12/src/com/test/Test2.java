package com.test;

import java.io.File;

public class Test2 {

	public static void show(File file) {

		if (file.isFile()) {
			System.out.println(file.getName());
		}

		if (file.isDirectory()) {
			File[] files = file.listFiles();
			for (File f : files) {
				show(f);
			}

		}

	}

	public static void main(String[] args) {

		File file = new File("C:/Users/acer/Desktop/s59-java-10");
		show(file);
	}
}
