package com.controller;

import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

	@RequestMapping("/view")
	public String view(@ModelAttribute("registration") RegistrationForm registrationForm) {
		return "home";
	}

	@RequestMapping("/submitForm")
	public String submit(@Valid @ModelAttribute("registration") RegistrationForm registrationForm,
			BindingResult bindingResult) {

		System.out.println(registrationForm);
		if (bindingResult.hasErrors()) {
			
			return "home";
		} else
			return "Result";
	}
	
	@InitBinder
	public void binder(WebDataBinder binder) {
		//SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy*****mm****dd");
		//binder.registerCustomEditor(Date.class, "birthday",new CustomDateEditor(dateFormat, true));
		
		//if u want yourName to convert into Lowercase in resultpage 
		binder.registerCustomEditor(String.class, "yourName", new NamePropertyEditor());

	}
}
