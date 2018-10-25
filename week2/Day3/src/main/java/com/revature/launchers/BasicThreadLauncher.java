package com.revature.launchers;

import com.revature.threads.BasicThread;

public class BasicThreadLauncher {
	public static void main(String[] args) throws InterruptedException {
		Thread t = new BasicThread();
		System.out.println(t.getState());
		t.start();
		Thread.sleep(500);
		System.out.println(t.getState());
		Thread.sleep(3000);
		System.out.println(t.getState());
//		while(true) {
//			System.out.println("hello from " + Thread.currentThread().getName());
//		}
	}
}
