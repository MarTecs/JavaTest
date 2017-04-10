package com.prac;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Prac2 {
	
	public static void main(String[] args) throws IOException {
		InputStream inputstream = new FileInputStream("E:/test.txt");
		
		//读写操作都是相对于虚拟机而言的，读取是把东西读到虚拟机中，而写则是把虚拟机中的东西写到硬盘上
		
		/*
		int s = inputstream.read();
		System.out.println(s);				//如果文件为空，说明没有读取到，因此返回的整数为-1
		*/
		
		
		//字节流一个一个的读
		int s = inputstream.read();
		
		while(s != -1 )
		{
			System.out.print((char)s);
			s = inputstream.read();
		}
		
		/*如果出现中文，这里将会出现乱码，因为一个汉字两个字节，而字节流每次只能读写一个，
		 * 因此每个汉字都只读1个字节，从而会出现乱码，因此我们进一步学习使用字符流来进行读
		
		*/
		
	inputstream.close();
		
		
		
	}
}
