package com.blog.eighth;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) throws ParseException {
		Scanner input = new Scanner(System.in);
		
		System.out.println("���������ʱ�䣺");
		String s = input.nextLine();
		
		System.out.println("�����뻹��ʱ�䣺");
		String s1 = input.nextLine();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
		
		Date date = sdf.parse(s);
		
		Date date1 = sdf.parse(s1);
		
		if( date.getTime() > date1.getTime() )
			System.out.println("����ɹ���");
		else
			System.out.println("����ʧ�ܣ�");
		
	}
}
