package com.ducat.model;

public class Sproduct {

	private String image;
	private String name;
	private float a_price;
	private float d_price;
	public Sproduct(String image, String name, float a_price, float d_price) {
		super();
		this.image = image;
		this.name = name;
		this.a_price = a_price;
		this.d_price = d_price;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public Sproduct() {
		super();
	}
	
	
}
