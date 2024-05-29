package com.src.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;

import junit2.Calculate;

@Tag("important")
public class TestClass {

	@Test
	public void testCalculateSquareRootPositiveNumber() {
		Double result = Calculate.calculateSquareRoot(2);
		assertEquals(2.0, result, 2);
	}

	@Test
	public void testCalculateSquareRootZero1() {
		double result = Calculate.calculateSquareRoot(0);
		assertEquals(0.0, result, 0.0001);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testCalculateSquareRootNegativeNumber() {
		Calculate.calculateSquareRoot(-1);
	}

	@Test
	public void testCalculateSquareRootNegativeNumber2() {
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
			Calculate.calculateSquareRoot(-1);
		});
		assertEquals("Number must be non-negative", exception.getMessage());
	}

	@Before
	public void before() {
		System.out.println("we using before class");
	}

	@After
	public void Aftercls() {
		System.out.println("we using after");
	}

	@Test
	@DisplayName("Second Test")
	public void secondTest() {
		System.out.println("Test: Executing second test.");
		Assertions.assertTrue(true);
	}

	@Ignore
	public void ignore() {
		System.out.println("we using ignore");
	}
}
