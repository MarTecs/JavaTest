package com.prac;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class Prac {

	public static void main(String[] args) throws IOException {
		
		//字符流一个一个的写
		InputStream inputstream = new FileInputStream("E:/test.txt");
		
		Reader reader = new FileReader("E:/test.txt");
		
		int ch = reader.read();
		
		while(ch != -1)
		{
			System.out.print((char)ch);
			ch = reader.read();
		}
		
		reader.close();
		
	}
}
