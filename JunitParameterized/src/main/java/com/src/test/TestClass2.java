package com.src.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.src.modal.ArithmeticOperators;

public class TestClass2 {
		
//    @BeforeClass
//	public static void before() {
//		arithmeticoperators=new ArithmeticOperators();
//	}
//	
//	@Test
//	public void sum() {
//		int a=32;
//		int b=54;
//		int expresult=86;
//		int accresult=arithmeticoperators.sum(a, b);
//		assertEquals(accresult, expresult);
//	}
//	
	public static void main(String[] args) {
		
	ArithmeticOperators arithmeticOperators = new ArithmeticOperators();
	int a = 10;
	int b = 10;
	int totall = 20;
	int get = arithmeticOperators.sum(a, b);
	if (totall == get) {
		System.out.println("success");
	} else {
		System.err.println("you are getting the error");
	}}
}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
