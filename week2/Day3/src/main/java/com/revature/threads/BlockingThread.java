package com.revature.threads;

import com.revature.util.BlockingUtil;

public class BlockingThread implements Runnable{
	private BlockingUtil bu;
	
	public BlockingThread(BlockingUtil bu) {
		this.bu = bu;
	}

	public void run() {
		bu.blockingMethod();
	}

}
