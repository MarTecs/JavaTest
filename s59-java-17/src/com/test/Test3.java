package com.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test3 {

	public static void main(String[] args) {
		String regex = "^1[34578][0-9]\\d{8}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher("15673357818");

		if (matcher.find()) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}

	}

}
