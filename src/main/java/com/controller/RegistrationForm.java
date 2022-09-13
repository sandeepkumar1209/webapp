package com.controller;

import java.util.Date;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import com.validator.Age;

public class RegistrationForm {
	@NotNull(message="Cannot be Empty ")
	private String yourName;
	
	@NotBlank(message="Cannot be Empty ")
	private String fatherName;
	
	@NotBlank
	private String gender;
	
	@Age(min=18,max=35,message="Age Should be between 18 to 35")
	private Integer age;
	
	@NotNull(message="Cannot be Empty ")
	private String address;
	
	@DateTimeFormat(pattern="yyyy-mm-dd")
	private Date birthday;
	
	@AssertTrue
	private boolean married;
	
	@NotBlank
	@Email(message="Please enter a valid email address")
	private String email;
	
	private String password;
	
	@NotBlank
	private String profession;
	
	private Phone phone;

	public RegistrationForm( String yourName,String fatherName,  String gender, Integer age,
		  String address, Date birthday,  boolean married, String email, String password,
		  String profession) {
		this.yourName = yourName;
		this.fatherName = fatherName;
		this.gender = gender;
		this.age = age;
		this.address = address;
		this.birthday = birthday;
		this.married = married;
		this.email = email;
		this.password = password;
		this.profession = profession;
	}

	public RegistrationForm() {
		super();
	}

	public String getYourName() {
		return yourName;
	}

	public void setYourName(String yourName) {
		this.yourName = yourName;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public boolean isMarried() {
		return married;
	}

	public void setMarried(boolean married) {
		this.married = married;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}
	public Integer getAge() {
		return age;
	}

	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "RegistrationForm [yourName=" + yourName + ", fatherName=" + fatherName + ", gender=" + gender
				+ ", address=" + address + ", birthday=" + birthday + ", married=" + married + ", email=" + email
				+ ", password=" + password + ", profession=" + profession + "]";
	}


	

	

	
	
	
	
	
	
	
	
	
	
	
	
	
}