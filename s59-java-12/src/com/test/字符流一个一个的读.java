package com.test;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class �ַ���һ��һ���Ķ� {

	public static void main(String[] args) throws IOException {
		// ������
		// InputStream inputStream = new FileInputStream("d:/a.txt");
		// �ַ�������
		Reader reader = new FileReader("d:/a.txt");

		int ch = reader.read();
		while (ch != -1) {
			System.out.println((char)ch);
			ch = reader.read();
		}

	}

}
