package com.ducat.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class AdminRegister {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int sno;
	UserName Name;
	String email;
	String gender;
	String mobile;
	String city;
	String country;
	String password;

	public AdminRegister(UserName name, String email, String gender, String mobile, String city, String country,
			String password) {
		super();
		Name = name;
		this.email = email;
		this.gender = gender;
		this.mobile = mobile;
		this.city = city;
		this.country = country;
		this.password = password;
	}

	public UserName getName() {
		return Name;
	}

	public void setName(UserName name) {
		Name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public AdminRegister() {
		super();
	}

}