package com.test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class �ֽ���һ��һ����д {

	public static void main(String[] args) throws IOException {

		String s = "hello sunjob  ������ܲ�";
		OutputStream outputStream = new FileOutputStream("d:/b.txt");

		for (int i = 0; i < s.length(); i++) {
			outputStream.write(s.charAt(i));
		}
		
		

	}

}
