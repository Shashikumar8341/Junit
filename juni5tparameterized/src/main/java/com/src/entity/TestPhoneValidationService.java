package com.src.entity;
import java.util.regex.Pattern; 

public class TestPhoneValidationService implements PhoneValidationService{

	private final Pattern phoneRegex=Pattern.compile("^\\+?(?:[0-9] ?){6,14}[0-9]$");
//	private final Pattern phoneRegex=Pattern.compile("8341866042");
	@Override
	public boolean validationservice(String phone) {
		return phone !=null && phoneRegex.matcher(phone).matches();
	}
}
