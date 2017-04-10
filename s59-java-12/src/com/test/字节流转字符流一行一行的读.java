package com.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class 字节流转字符流一行一行的读 {

	public static void main(String[] args) throws IOException {

		InputStream inputStream = new FileInputStream("d:/a.txt");
		Reader reader = new InputStreamReader(inputStream, "utf-8");

		int ch = reader.read();
		while (ch != -1) {
			System.out.println((char)ch);
			ch = reader.read();

		}

	}

}
