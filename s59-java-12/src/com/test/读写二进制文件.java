package com.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ��д�������ļ� {

	public static void main(String[] args) throws IOException {
		// ������
		InputStream inputStream = new FileInputStream("d:/a.mp3");
		//  true  �Ƿ�׷��
		OutputStream outputStream = new FileOutputStream(
				"C:/Users\\acer\\Desktop/b.mp3" , true);

		// ÿ��ֻ��һ���ֽ�
		int ch = inputStream.read();

		while (ch != -1) {
			outputStream.write(ch);
			ch = inputStream.read();
		}

		outputStream.close();
		inputStream.close();

	}

}
