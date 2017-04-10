package com.prac;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.tomcat.jni.FileInfo;

public class Prac5 {
		//读写二进制文件
	public static void main(String[] args) throws IOException {
		FileInputStream inputStream = new FileInputStream("E:/音乐/1.mp3");
		int ch = inputStream.read();
		OutputStream outputStream = new FileOutputStream("C:\\Users\\SiVan\\Desktop\\2.mp3");
		while(ch != -1)
		{
			outputStream.write(ch);
			ch = inputStream.read();
		}
		System.out.println("读写完毕请稍后");
	}
}
