package com.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class �ֽ���һ��һ���Ķ�д {

	public static void main(String[] args) throws IOException {

		// ������
		InputStream inputStream = new FileInputStream("d:/a.mp3");
		// true �Ƿ�׷��
		OutputStream outputStream = new FileOutputStream(
				"C:/Users\\acer\\Desktop/b.mp3");

		// ÿ��ֻ��һ���ֽ�
		byte[] bytes = new byte[1024];
		// size ʵ�ʷ��˶��ٸ�
		int size = inputStream.read(bytes);		//��ȡһ�������Լ��洢��bytes������

		while (size > 0) {
			outputStream.write(bytes , 0 , size);
			size = inputStream.read(bytes);
  
		}

		outputStream.close();
		inputStream.close();

	}

}
