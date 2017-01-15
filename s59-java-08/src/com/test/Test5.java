package com.test;

import java.util.Calendar;
import java.util.Date;

public class Test5 {

	public static void main(String[] args) {
		// 得到系统的当前时间
		Date date = new Date();
		Calendar calendar = Calendar.getInstance();
		// 把要修改的时间赋值给Calendar
		calendar.setTime(date);
		calendar.set(Calendar.YEAR, 2016);
		calendar.set(Calendar.MONTH, 6);
		//把修改之后的时间让date保存
		date = calendar.getTime();
		System.out.println(date);
		

	}
}
