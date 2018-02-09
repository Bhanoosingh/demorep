package com.demotestcase;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTestCase {

	private static Calculator calculator;
	@BeforeClass
	public static void setUp() throws Exception {
		calculator=new Calculator();
	}

	@AfterClass
	public static void tearDown() throws Exception {
		calculator=null;
	}

	@Test
	public void addtest() {
		assertEquals("Value Should be equal to 30", 30, calculator.add(20, 10));
	}
	@Test
	public void addtestFaliure() {
		assertNotEquals("Value Should not be equal to 30", 30, calculator.add(20, 20));
	}
	@Test
	public void subtracttest() {
		assertEquals("Value Should be equal to 10", 10, calculator.subtract(20, 10));
	}
	@Test
	public void subtracttestFaliure() {
		assertNotEquals("Value Should not be equal to 10", 10, calculator.subtract(20, 20));
	}
	@Test
	public void dividetest() {
		assertEquals("Value Should be equal to 2", 2, calculator.divide(20, 10));
	}
	@Test(expected=java.lang.ArithmeticException.class)
	public void dividetestFaliure() {
		assertEquals("Value Should be equal to 2", 2, calculator.divide(20, 0));
	}

}
