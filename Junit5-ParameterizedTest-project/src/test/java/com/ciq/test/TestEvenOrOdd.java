package com.ciq.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.ciq.entity.EvenOrOdd;

public class TestEvenOrOdd {

	@Test
	public void test_checkEvenOrOdd() {
		EvenOrOdd evenOrOdd = new EvenOrOdd();

		boolean actualValue = evenOrOdd.checkEvenOrOdd(10);

		assertTrue(actualValue);
	}

	@Test
	public void test_checkEvenOrOdd1() {
		EvenOrOdd evenOrOdd = new EvenOrOdd();

		boolean actualValue = evenOrOdd.checkEvenOrOdd(11);

		assertFalse(actualValue);
	}

	

}