package com.test;


public class Testc {
	public static void main(String[] args) {

		int flag = 0;
		String s = "()))";

		for (int i = 0; i < s.length(); i++) {
			if ((s.charAt(i) + "").equals("(")) {
				flag++;
			}

			if ((s.charAt(i) + "").equals(")")) {
				if (i == 0) {
					System.out.println(false);
					return;
				}
				flag--;
			}
		}

		if (flag == 0) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

	}

}
