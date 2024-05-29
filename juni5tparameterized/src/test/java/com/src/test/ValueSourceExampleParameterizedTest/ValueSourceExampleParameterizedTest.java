package com.src.test.ValueSourceExampleParameterizedTest;

import com.src.entity.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValueSourceExampleParameterizedTest {

	private final PhoneValidationService phoneValidationService = new TestPhoneValidationService();

	@ParameterizedTest
	@ValueSource(strings = { "555 555 55 55", "5555555555", "+15555555555" })
	void testProcessValidPhones(String phone) {
		assertTrue(phoneValidationService.validationservice(phone));
	}

	@ParameterizedTest
	@ValueSource(strings = { "559", "@+8341866042", "test" })
	void testProcessInvalidPhones(String phone) {
		assertFalse(phoneValidationService.validationservice(phone));
	}

}
