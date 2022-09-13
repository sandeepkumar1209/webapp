package com.controller;

import java.beans.PropertyEditorSupport;

public class NamePropertyEditor extends PropertyEditorSupport  {

	@SuppressWarnings("null")
	public void setAsText(String yourName) throws java.lang.IllegalArgumentException{
		if (yourName!=null || !yourName.isEmpty()) {
			setValue(yourName.toLowerCase());
		}
	}
}
