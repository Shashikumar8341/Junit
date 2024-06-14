package com.ciq.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import com.ciq.entity.EvenOrOddUsingCSVFile;

public class ParameterizedTestUsingCsvFileSource {

	@ParameterizedTest
	@CsvFileSource(resources = "[/inputData.csv]", numLinesToSkip = 1)
	public void test_EvenOrOdd(int input, String expectedValue) {

		EvenOrOddUsingCSVFile evenOrOddUsingCSVFile = new EvenOrOddUsingCSVFile();

		String actualValue = evenOrOddUsingCSVFile.checkEvenOrOdd(input);

		assertEquals(expectedValue, actualValue);

	}

	@ParameterizedTest
	@CsvSource({ "10,even", "11,odd", "13,odd" })
	public void test_EvenOrOdd1(int input, String expectedValue) {

		EvenOrOddUsingCSVFile evenOrOddUsingCSVFile = new EvenOrOddUsingCSVFile();

		String actualValue = evenOrOddUsingCSVFile.checkEvenOrOdd(input);

		assertEquals(expectedValue, actualValue);

	}

	@ParameterizedTest
	@CsvSource(value = { "test:test", "tEst:test", "Java:java" }, delimiter = ':')
	void toLowerCase_ShouldGenerateTheExpectedLowercaseValue(String input, String expected) {
		String actualValue = input.toLowerCase();
		assertEquals(expected, actualValue);
	}

}