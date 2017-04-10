package com.prac;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Prac3 {

	public static void main(String[] args) throws IOException {
		//缓冲流一行一行的读
		
		Reader reader = new FileReader("E:/Test.txt");
		
		BufferedReader buffer = new BufferedReader(reader);
		
		String str = buffer.readLine();
		
		while( str != null )
		{
			System.out.println(str);
			str = buffer.readLine();
		}
		
		buffer.close();
		
		
		
		
	}
}
