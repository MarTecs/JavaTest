package com.test;

import java.util.Calendar;
import java.util.Date;

public class Test5 {

	public static void main(String[] args) {
		// �õ�ϵͳ�ĵ�ǰʱ��
		Date date = new Date();
		Calendar calendar = Calendar.getInstance();
		// ��Ҫ�޸ĵ�ʱ�丳ֵ��Calendar
		calendar.setTime(date);
		calendar.set(Calendar.YEAR, 2016);
		calendar.set(Calendar.MONTH, 6);
		//���޸�֮���ʱ����date����
		date = calendar.getTime();
		System.out.println(date);
		

	}
}
