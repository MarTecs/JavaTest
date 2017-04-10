package com.prac;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Cast {

	public static void main(String[] args) throws IOException {
		//字节流转为字符流一个一个的读
		InputStream inputStream = new FileInputStream("E:/Test.txt");
		
		Reader reader = new InputStreamReader(inputStream, "UTF-8");
		
		int ch = reader.read();
		
		while(ch != -1)
		{
			System.out.print((char)ch);
			ch = reader.read();
		}
	}
}
