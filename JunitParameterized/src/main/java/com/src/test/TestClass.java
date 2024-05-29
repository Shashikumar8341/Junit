package com.src.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.src.modal.ArithmeticOperators;

public class TestClass {

	@BeforeClass
	public static void before() {
		ArithmeticOperators arithmeticoperators = new ArithmeticOperators();
	}

	@Test
	public void sum() {
		int a = 32;
		int b = 54;
		int expresult = 86;
		int accresult;

		accresult = ArithmeticOperators.sum(a, b);

		assertEquals(accresult, expresult);
	}
}
