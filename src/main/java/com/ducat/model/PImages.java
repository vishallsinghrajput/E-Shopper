package com.ducat.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class PImages {

	@Column(length = 1000)
	String image1;
	@Column(length = 1000)
	String image2;
	@Column(length = 1000)
	String image3;
	@Column(length = 1000)
	String image4;
	public PImages(String image1, String image2, String image3, String image4) {
		super();
		this.image1 = image1;
		this.image2 = image2;
		this.image3 = image3;
		this.image4 = image4;
	}
	public String getImage1() {
		return image1;
	}
	public void setImage1(String image1) {
		this.image1 = image1;
	}
	public String getImage2() {
		return image2;
	}
	public void setImage2(String image2) {
		this.image2 = image2;
	}
	public String getImage3() {
		return image3;
	}
	public void setImage3(String image3) {
		this.image3 = image3;
	}
	public String getImage4() {
		return image4;
	}
	public void setImage4(String image4) {
		this.image4 = image4;
	}
	public PImages() {
		super();
	}
	
	
}
