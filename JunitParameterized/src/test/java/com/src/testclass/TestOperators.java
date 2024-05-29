package com.src.testclass;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.src.modal.ArithmeticOperators;

public class TestOperators {

	@Test
	
	public void addsum() {
		ArithmeticOperators arithmeticOperators=new ArithmeticOperators();
		int a=15;
		int b=15;
		int sum=30;
		@SuppressWarnings("static-access")
		int accResult=arithmeticOperators.sum(a, b);
		assertEquals(sum, accResult);
	}

	@Test
	public void sub() {
		ArithmeticOperators arithmeticOperators=new ArithmeticOperators();
        assertEquals(3, arithmeticOperators.sub(5, 2));
	
	}
	@Test
	public void multi() {
		ArithmeticOperators arithmeticOperators=new ArithmeticOperators();
		assertEquals(10, arithmeticOperators.malti(5, 2));
		
	}
	@Test
	public void divi() {
		ArithmeticOperators arithmeticOperators=new ArithmeticOperators();
		assertEquals(1, arithmeticOperators.divi(5, 5));
		
	}
	
}
