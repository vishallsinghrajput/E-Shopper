package com.ducat.model;

import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class PReview {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int Rsno;
	@Column(length = 1000)
	private String Rimage;
	private String Rname;
	private String review;
	private String date;
	@ManyToOne()
	private Products products;
	public PReview(String rimage, String rname, String review, String date, Products products) {
		super();
		Rimage = rimage;
		Rname = rname;
		this.review = review;
		this.date = date;
		this.products = products;
	}
	public String getRimage() {
		return Rimage;
	}
	public void setRimage(String rimage) {
		Rimage = rimage;
	}
	public String getRname() {
		return Rname;
	}
	public void setRname(String rname) {
		Rname = rname;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Products getProducts() {
		return products;
	}
	public void setProducts(Products products) {
		this.products = products;
	}
	public PReview() {
		super();
	}
	
	
}
