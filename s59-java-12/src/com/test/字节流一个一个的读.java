package com.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class 字节流一个一个的读 {

	public static void main(String[] args) throws IOException {
		// 创建流
		InputStream inputStream = new FileInputStream("d:/a.txt");

		// 每次只读一个字节
		int ch = inputStream.read();

		while (ch != -1) {
			System.out.println((char)ch);
			ch = inputStream.read();
		}


	}

}
