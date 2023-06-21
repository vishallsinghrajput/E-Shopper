package com.ducat.model;

import jakarta.persistence.Embeddable;

@Embeddable
public class UserName {

	String Fname;
	String Lname;
	public UserName(String fname, String lname) {
		super();
		Fname = fname;
		Lname = lname;
	}
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public UserName() {
		super();
	}
	
	
	
}
