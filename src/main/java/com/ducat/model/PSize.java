package com.ducat.model;

import jakarta.persistence.Embeddable;

@Embeddable
public class PSize {

	String size1;
	String size2;
	String size3;
	String size4;

	public PSize(String size1, String size2, String size3, String size4) {
		super();
		this.size1 = size1;
		this.size2 = size2;
		this.size3 = size3;
		this.size4 = size4;
	}

	public String getSize1() {
		return size1;
	}

	public void setSize1(String size1) {
		this.size1 = size1;
	}

	public String getSize2() {
		return size2;
	}

	public void setSize2(String size2) {
		this.size2 = size2;
	}

	public String getSize3() {
		return size3;
	}

	public void setSize3(String size3) {
		this.size3 = size3;
	}

	public String getSize4() {
		return size4;
	}

	public void setSize4(String size4) {
		this.size4 = size4;
	}

	public PSize() {
		super();
	}

}
