package com.blog.eighth;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test4 {

	public static void main(String[] args) {
		
		//1.�õ�ϵͳ��ǰʱ��
		Date date = new Date();
		Calendar calendar = Calendar.getInstance();
		
		//2.��Ҫ�޸ĵ�ʱ���cal,ͬʱ�����޸�
		calendar.setTime(date);
		calendar.set(calendar.YEAR, 2016);
		calendar.set(calendar.MONTH, 11); 
		calendar.set(calendar.DATE, 31);
		
		//3.�޸���ɺ�ת����Date���б���
		date = calendar.getTime();
		System.out.println(date);
		
		
	}
}
