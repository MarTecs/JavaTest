package com.prac;

public class Prac {

	public static void main(String[] args)
	{
		//输出0.0-10.0之间的整数
		for(int i = 0; i < 100; i++ )
		{
			System.out.println(Math.floor(Math.random() * 11  ));
		}
	}
}