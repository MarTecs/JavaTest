package com.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class �ֽ���һ��һ���Ķ� {

	public static void main(String[] args) throws IOException {
		// ������
		InputStream inputStream = new FileInputStream("d:/a.txt");

		// ÿ��ֻ��һ���ֽ�
		int ch = inputStream.read();

		while (ch != -1) {
			System.out.println((char)ch);
			ch = inputStream.read();
		}


	}

}
