package com.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class 读写二进制文件 {

	public static void main(String[] args) throws IOException {
		// 创建流
		InputStream inputStream = new FileInputStream("d:/a.mp3");
		//  true  是否追加
		OutputStream outputStream = new FileOutputStream(
				"C:/Users\\acer\\Desktop/b.mp3" , true);

		// 每次只读一个字节
		int ch = inputStream.read();

		while (ch != -1) {
			outputStream.write(ch);
			ch = inputStream.read();
		}

		outputStream.close();
		inputStream.close();

	}

}
