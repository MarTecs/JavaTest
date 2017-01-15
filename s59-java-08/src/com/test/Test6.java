package com.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test6 {

	public static void main(String[] args) throws ParseException {
		// 日期的格式化
		Date date = new Date();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String s = sdf.format(date);
		System.out.println(s);
		
		Date date2 = sdf.parse("2016/01/01 12:34:30");
		System.out.println(date2);
		
		
	}
}
