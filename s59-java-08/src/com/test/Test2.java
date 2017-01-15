package com.test;

import java.util.Random;

public class Test2 {

	// char "" +'a'+'b'

	public static void main(String[] args) {
		String s = "abcdefghijklmnopqrstuvwxyz";
		Random random = new Random();
		char[] chs = new char[4];
		for (int i = 0; i < 4; i++) {
			char ch = s.charAt(random.nextInt(26));
			chs[i] = ch;
		}

		String code = new String(chs);
		System.out.println(code);

	}
}
