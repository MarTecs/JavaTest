package com.test;

import java.util.Date;

public class Test4 {

	public static void main(String[] args) {
		// 得到系统的当前时间
		Date date = new Date();
		System.out.println(date);
		
		System.out.println(date.getYear());
		System.out.println(date.getMonth());
		System.out.println(date.getDay());
		System.out.println(date.getDate());
		
		date.setYear(2016);
		System.out.println(date);
		date.setMonth(2);
		System.out.println(date);
		System.out.println(date.getTime());
		//  保存时间用date  修改时间用Calendar

	}
}
