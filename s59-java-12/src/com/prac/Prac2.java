package com.prac;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Prac2 {
	
	public static void main(String[] args) throws IOException {
		InputStream inputstream = new FileInputStream("E:/test.txt");
		
		//��д���������������������Եģ���ȡ�ǰѶ�������������У���д���ǰ�������еĶ���д��Ӳ����
		
		/*
		int s = inputstream.read();
		System.out.println(s);				//����ļ�Ϊ�գ�˵��û�ж�ȡ������˷��ص�����Ϊ-1
		*/
		
		
		//�ֽ���һ��һ���Ķ�
		int s = inputstream.read();
		
		while(s != -1 )
		{
			System.out.print((char)s);
			s = inputstream.read();
		}
		
		/*����������ģ����ｫ��������룬��Ϊһ�����������ֽڣ����ֽ���ÿ��ֻ�ܶ�дһ����
		 * ���ÿ�����ֶ�ֻ��1���ֽڣ��Ӷ���������룬������ǽ�һ��ѧϰʹ���ַ��������ж�
		
		*/
		
	inputstream.close();
		
		
		
	}
}
