package com.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class 字节流一串一串的读写 {

	public static void main(String[] args) throws IOException {

		// 创建流
		InputStream inputStream = new FileInputStream("d:/a.mp3");
		// true 是否追加
		OutputStream outputStream = new FileOutputStream(
				"C:/Users\\acer\\Desktop/b.mp3");

		// 每次只读一个字节
		byte[] bytes = new byte[1024];
		// size 实际放了多少个
		int size = inputStream.read(bytes);		//读取一定量的自己存储在bytes数组中

		while (size > 0) {
			outputStream.write(bytes , 0 , size);
			size = inputStream.read(bytes);
  
		}

		outputStream.close();
		inputStream.close();

	}

}
