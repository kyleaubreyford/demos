package com.revature.util;

public class BlockingUtil {
	public synchronized void blockingMethod() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
