package com.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

	public static void main(String[] args) {
		// ����ģ���ַ���
		String regex = "[a-d[m-p]]";
		// ��ģ����б���
		Pattern pattern = Pattern.compile(regex);
		// ����ֵ����Ҫ�Ƚϵ�Ŀ���ַ���
		Matcher matcher = pattern.matcher("ffffff");
		if (matcher.find()) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}

	}

}
