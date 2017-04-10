package com.test;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class 字符流一个一个的读 {

	public static void main(String[] args) throws IOException {
		// 创建流
		// InputStream inputStream = new FileInputStream("d:/a.txt");
		// 字符输入流
		Reader reader = new FileReader("d:/a.txt");

		int ch = reader.read();
		while (ch != -1) {
			System.out.println((char)ch);
			ch = reader.read();
		}

	}

}
