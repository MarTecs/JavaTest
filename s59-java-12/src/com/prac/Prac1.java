package com.prac;

import java.io.File;

public class Prac1 {
	
	public static void main(String[] args) {
		File file = new File("E:/“Ù¿÷");
		show(file);
		
		
	}
	
	public static void show(File file)
	{
		if(file.isFile())
			System.out.println(file.getName());
		
		if(file.isDirectory())
		{
			File[] files = file.listFiles();
			for (File f : files) {
				show(f);
			}
		}
	}
	
	
	
}
