package com.thread;

public class TestThread2 implements Runnable {

	@Override
	public void run() {
		while (true) {
			System.out.println(Thread.currentThread().getId());
		}

	}

	public static void main(String[] args) {
		TestThread2 testThread = new TestThread2();
		Thread thread = new Thread(testThread);
		thread.start();

		TestThread2 testThread2 = new TestThread2();
		Thread thread2 = new Thread(testThread2);
		thread2.start();

	}

}
