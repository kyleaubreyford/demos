package com.revature.Launchers;

import com.revature.util.MyAmzingUtilityClass;

public class ExceptionLauncher {
	public static void main(String[] args) {
//		MyAmzingUtilityClass util = new MyAmzingUtilityClass();
//		try {
//			util.badMethod();
//			System.out.println("suceess");
//		} catch (Exception e) {
//			System.out.println("something went wrong, handling it");
//			e.printStackTrace();
//		} finally {
//			System.out.println("program complete, we are done");
//		}
		
		
		try {
			double d = 10/0;
			System.out.println(d);
		} catch (ArithmeticException e) {
			System.out.println("recovered");
		} catch (Exception e) {
			
		}
		
		
	}
}
