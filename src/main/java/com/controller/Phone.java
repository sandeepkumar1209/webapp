package com.controller;

public class Phone {
	
	private String countrycode;
	private String phoneno;
	
	public Phone(String countrycode, String phoneno) {
		super();
		this.countrycode = countrycode;
		this.phoneno = phoneno;
	}

	public Phone() {
		super();
	}

	public String getCountrycode() {
		return countrycode;
	}

	public void setCountrycode(String countrycode) {
		this.countrycode = countrycode;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	@Override
	public String toString() {
		return "Phone [countrycode=" + countrycode + ", phoneno=" + phoneno + "]";
	}
	

}
