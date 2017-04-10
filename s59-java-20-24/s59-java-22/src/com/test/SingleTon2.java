package com.test;

public class SingleTon2 {

	private SingleTon2 singleTon = new SingleTon2();

	private SingleTon2() {

	}
	
	public SingleTon2 getInstance(){
		return singleTon ;
	}
	

}
