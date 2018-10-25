package com.revature.launchers;

import org.apache.log4j.Logger;

import com.revature.threads.WaitingThread;

public class WaitingThreadLauncher {
	private static Logger log = Logger.getRootLogger();
	public static void main(String[] args) throws InterruptedException {
		log.debug("Creating a thread that will just sleep for 5 seconds");
		Thread sleepyThread = new Thread(() -> {
			try {
				log.trace("Thread is about to go to sleep for 5 secodns");
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			log.debug("Thread is done will now be terminated");
		});
		
		log.debug("Creating a thread to wait on the thread that is sleepling");
		Thread waitingThread = new Thread(new WaitingThread(sleepyThread));
		sleepyThread.start();
		waitingThread.start();
		Thread.sleep(500);
		
		log.trace("The state of waitingThread is " + waitingThread.getState());
		
	}
}
