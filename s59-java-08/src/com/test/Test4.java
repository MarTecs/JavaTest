package com.test;

import java.util.Date;

public class Test4 {

	public static void main(String[] args) {
		// �õ�ϵͳ�ĵ�ǰʱ��
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
		//  ����ʱ����date  �޸�ʱ����Calendar

	}
}
