package com.ducat.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class URegister {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int sno;
	UserName uName;
	String email;
	String gender;
	String city; 
	String country;
	String password;
	public URegister(UserName uName, String email, String gender, String city, String country, String password) {
		super();
		this.uName = uName;
		this.email = email;
		this.gender = gender;
		this.city = city;
		this.country = country;
		this.password = password;
	}
	public URegister() {
		
	}
	public UserName getuName() {
		return uName;
	}
	public void setuName(UserName uName) {
		this.uName = uName;
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
	
}
