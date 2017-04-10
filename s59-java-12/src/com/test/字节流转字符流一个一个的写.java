package com.test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class 字节流转字符流一个一个的写 {

	public static void main(String[] args) throws IOException {

		String s = "hello sunjob  你好赛杰博";
		OutputStream outputStream = new FileOutputStream("d:/b.txt");
		Writer writer = new OutputStreamWriter(outputStream);

		for (int i = 0; i < s.length(); i++) {
			writer.write(s.charAt(i));
		}

		writer.close();
		

	}

}
