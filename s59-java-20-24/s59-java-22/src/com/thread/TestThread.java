package com.thread;

public class TestThread extends Thread {

	@Override
	public void run() {
		while (true) {
			System.out.println(Thread.currentThread().getId());
		}

	}

	public static void main(String[] args) {
		TestThread testThread = new TestThread();
		testThread.start();// ¿ªÆôÏß³Ì

		TestThread testThread2 = new TestThread();
		testThread2.start();

	}

}
