package com.example.demo;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.controller.Phone;

public class PhoneNumberFormatter implements Formatter<Phone> {

	@Override
	public String print(Phone object, Locale locale) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Phone parse(String completePhoneNumber, Locale locale) throws ParseException {
		
		Phone p= new Phone();
		String [] phoneNumberArray=completePhoneNumber.split("-");
		
		int index = completePhoneNumber.indexOf("-");
		
		if(index==-1) {
			p.setCountrycode("91");
			p.setPhoneno(phoneNumberArray[0]);
		}
		
		else {
	    p.setCountrycode(phoneNumberArray[0]);
	    p.setPhoneno(phoneNumberArray[1]);
		}
		return p;
	}

}
