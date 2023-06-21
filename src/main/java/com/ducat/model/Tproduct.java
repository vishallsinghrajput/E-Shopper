package com.ducat.model;

public class Tproduct {
	
	private String name;
	private String image;
	private float a_price;
	private float d_price;
	public Tproduct(String name, String image, float a_price, float d_price) {
		super();
		this.name = name;
		this.image = image;
		this.a_price = a_price;
		this.d_price = d_price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public float getA_price() {
		return a_price;
	}
	public void setA_price(float a_price) {
		this.a_price = a_price;
	}
	public float getD_price() {
		return d_price;
	}
	public void setD_price(float d_price) {
		this.d_price = d_price;
	}
	
	
	
}