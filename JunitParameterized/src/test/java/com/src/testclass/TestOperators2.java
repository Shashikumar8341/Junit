package com.src.testclass;

import static org.junit.Assert.assertEquals;

import java.util.*;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.src.modal.PrimeUtils;

@RunWith(Parameterized.class)
public class TestOperators2 {
	private int input;
	private boolean exceptedoutput;

	/**
	 * @param input
	 * @param exceptedoutput
	 */
	public TestOperators2(int input, boolean exceptedoutput) {
		super();
		this.input = input;
		this.exceptedoutput = exceptedoutput;
	}

	@Parameterized.Parameters
	public static List<Object[]> data() {
		return Arrays.asList(new Object[][] { { 2, true }, { 3, false }, { 4, true }, { 5, false }, { 6, true },
				{ 17, false }, { 20, true }, { 23, false } });
	}

	@Test
	public void iseven() {
		assertEquals(true, PrimeUtils.iseven(10));
	}
	@Test
	public void iseven1() {
		assertEquals(exceptedoutput, PrimeUtils.isPrime(input));
	}
	@Test
	public void iseven2() {
		assertEquals(exceptedoutput, PrimeUtils.iseven(input));
	}

	}
