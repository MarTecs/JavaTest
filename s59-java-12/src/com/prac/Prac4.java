package com.prac;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.catalina.connector.OutputBuffer;

public class Prac4 {
			//�ֽ���һ��һ����д
	public static void main(String[] args) throws IOException {
		String s = "Lenovo Dell Mac";
		
		FileOutputStream fileOutputStream = new FileOutputStream("E:/Test.txt");
		
		for (int i = 0; i < s.length(); i++) {
			fileOutputStream.write(s.charAt(i));
		}
	
		
	}
}
