package com.proxy;

import com.inter.StuManager;

public class MyProxy {

	StuManager manager;

	public MyProxy(StuManager manager) {
		this.manager = manager;
	}

	public void log() {
		System.out.println("log");
	}

	public void add() {
		log();
		manager.add();
	}

	public void del() {
		log();
		manager.del();
	}

}
