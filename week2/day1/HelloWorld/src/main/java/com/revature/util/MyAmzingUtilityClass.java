package com.revature.util;

public class MyAmzingUtilityClass {
	public void badMethod() throws Exception {
		double rand = Math.random();
		if (rand > 0.9) {
			throw new Exception();
		}
		System.out.println("worked!");
	}
}
