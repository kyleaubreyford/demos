package com.revature.threads;

public class WaitingThread implements Runnable {

	private Thread other;
	
	public WaitingThread(Thread other) {
		this.other = other;
	}
	
	public void run() {
		try {
			other.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
