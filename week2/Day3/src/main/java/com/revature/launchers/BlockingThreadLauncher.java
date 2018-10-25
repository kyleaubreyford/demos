package com.revature.launchers;

import com.revature.threads.BlockingThread;
import com.revature.util.BlockingUtil;

public class BlockingThreadLauncher {
	public static void main(String[] args) throws InterruptedException {
		BlockingUtil bu = new BlockingUtil();
		Thread t1 = new Thread(new BlockingThread(bu));
		Thread t2 = new Thread(new BlockingThread(bu));
		
		t1.start();
		Thread.sleep(500);
		t2.start();
		Thread.sleep(500);
		System.out.println(t2.getState());
		System.out.println(t1.getState());
	}
}	
