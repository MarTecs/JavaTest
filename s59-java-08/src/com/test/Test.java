package com.test;

///导包   指定类是哪个包中的类
import java.util.Random;

public class Test {

	public static void main(String[] args) {
		Random random = new Random();
		int n =random.nextInt(1);
		System.out.println(n);
	}
}
