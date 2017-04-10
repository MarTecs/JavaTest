package com.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

	public static void main(String[] args) {
		// 给定模版字符串
		String regex = "[a-d[m-p]]";
		// 把模版进行编译
		Pattern pattern = Pattern.compile(regex);
		// 参数值的是要比较的目标字符串
		Matcher matcher = pattern.matcher("ffffff");
		if (matcher.find()) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}

	}

}
