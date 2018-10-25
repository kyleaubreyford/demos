package com.revature.util;

import org.apache.log4j.Logger;

/**
 * Our awesome math application for doing a useless computation
 * 
 * @author USER
 *
 */
public class MyApplication {

	private Calculator calc = new Calculator();
	private Logger log = Logger.getRootLogger();

	/**
	 * Sums the product of two and three, one times
	 * 
	 * @param one   the amount of times to multiply two and three together
	 * @param two
	 * @param three
	 * @return
	 */
	public double complexComputation(int one, double two, double three) {
		double result = 0;
		for (int i = 0; i < one; i++) {
			result = calc.add(result, calc.multiply(two, three));
		}
		return result;
	}

}
