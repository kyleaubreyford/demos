package com.revature.threads;

public class BasicThread extends Thread {
	@Override
	public void run() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		while(true) {
////			System.out.println("hello from " + Thread.currentThread().getName());
//		}
	}
}
