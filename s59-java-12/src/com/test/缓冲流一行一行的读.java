package com.test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class ������һ��һ�еĶ� {

	public static void main(String[] args) throws IOException {

		InputStream inputStream = new FileInputStream("d:/a.txt");
		Reader reader = new InputStreamReader(inputStream, "utf-8");
		BufferedReader bufferedReader = new BufferedReader(reader);

		String line = bufferedReader.readLine();

		while (line != null) {
			System.out.println(line);
			line = bufferedReader.readLine();
		}

	}

}
