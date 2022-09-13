package com.validator;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Retention(RUNTIME)
@Target(FIELD)
@Constraint(validatedBy= {AgeValidatorConstraint.class})
public @interface Age {
	
	 int min() default 18;
	 int max() default 35;
	 
	 String message() default " Age should be between 18 to 35";
	 
	 public Class<?>[] groups() default{};
		
	 public Class<? extends Payload>[] payload() default{}; 
	

}
