package com.revature.util;

import static org.mockito.Mockito.when;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTests {
	private static Logger log = Logger.getRootLogger();

	@Mock
	private Calculator calc;

	@InjectMocks
	private final MyApplication ma = new MyApplication();

	@BeforeClass
	public static void beforeAll() {
		log.debug("before any test has run");
	}

	@Before
	public void beforeEach() {
		log.debug("runs once before each and every test");
	}

	@Test
	public void complextComputationTestOne() {
		when(calc.multiply(1, 1)).thenReturn(1d);
		when(calc.add(0, 1)).thenReturn(1d);
		double result = ma.complexComputation(1, 1, 1);

		Assert.assertEquals(1d, result, 0.0);

	}

	@Test
	public void complextComputationTestTwo() {
		when(calc.multiply(5, 7)).thenReturn(35d);
		when(calc.add(0, 35)).thenReturn(35d);
		when(calc.add(35, 35)).thenReturn(70d);
		double result = ma.complexComputation(2, 5, 7);

		Assert.assertEquals(70d, result, 0.0);

	}

	@After
	public void afterEach() {
		log.debug("After each and every test");
	}

	@AfterClass
	public static void afterAll() {
		log.debug("After all tests have been run");
	}

}
