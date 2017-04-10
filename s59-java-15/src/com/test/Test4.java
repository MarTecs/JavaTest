package com.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test4 {

	public static void main(String[] args) {
		String regex = "^\\d{17}[0-9xX]$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher("140624200102220012");

		if (matcher.find()) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}
}
