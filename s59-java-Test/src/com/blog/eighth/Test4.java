package com.blog.eighth;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test4 {

	public static void main(String[] args) {
		
		//1.得到系统当前时间
		Date date = new Date();
		Calendar calendar = Calendar.getInstance();
		
		//2.把要修改的时间给cal,同时进行修改
		calendar.setTime(date);
		calendar.set(calendar.YEAR, 2016);
		calendar.set(calendar.MONTH, 11); 
		calendar.set(calendar.DATE, 31);
		
		//3.修改完成后转换成Date进行保存
		date = calendar.getTime();
		System.out.println(date);
		
		
	}
}
