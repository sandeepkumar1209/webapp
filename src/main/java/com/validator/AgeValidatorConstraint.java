package com.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AgeValidatorConstraint implements ConstraintValidator<Age, Integer> {

	private int min;
	private int max;

	public void initialize(Age age) {
		this.min=age.min();
		this.max=age.max();
	}

	
	@Override
	public boolean isValid(Integer age, ConstraintValidatorContext context) {
		
		if(age==null) {
			return false;
		}
		if(age<min || age>max) {
			return false;
		}
		return true;
	}

}
