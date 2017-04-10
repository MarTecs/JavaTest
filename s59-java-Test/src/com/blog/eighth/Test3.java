package com.blog.eighth;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) throws ParseException {
		Scanner input = new Scanner(System.in);
		
		System.out.println("请输入借书时间：");
		String s = input.nextLine();
		
		System.out.println("请输入还书时间：");
		String s1 = input.nextLine();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
		
		Date date = sdf.parse(s);
		
		Date date1 = sdf.parse(s1);
		
		if( date.getTime() > date1.getTime() )
			System.out.println("借书成功！");
		else
			System.out.println("借书失败！");
		
	}
}
