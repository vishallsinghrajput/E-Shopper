package com.ducat.model;

import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Products {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int sno;
	private String p_name;
	private float p_price;
	private int p_quantity;
	private PImages images;
	private PSize size;
	private PColor color;
	private float rate;
	@Column(length = 1000)
	private String Description;
	@Column(length = 1000)
	private String info;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "products")
	private List<PReview> pReview;
	private String category;

	public Products(String p_name, float p_price, int p_quantity, PImages images, PSize size, PColor color, float rate,
			String description, String info, List<PReview> pReview, String category) {
		super();
		this.p_name = p_name;
		this.p_price = p_price;
		this.p_quantity = p_quantity;
		this.images = images;
		this.size = size;
		this.color = color;
		this.rate = rate;
		Description = description;
		this.info = info;
		this.pReview = pReview;
		this.category = category;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public float getP_price() {
		return p_price;
	}

	public void setP_price(float p_price) {
		this.p_price = p_price;
	}

	public int getP_quantity() {
		return p_quantity;
	}

	public void setP_quantity(int p_quantity) {
		this.p_quantity = p_quantity;
	}

	public PImages getImages() {
		return images;
	}

	public void setImages(PImages images) {
		this.images = images;
	}

	public PSize getSize() {
		return size;
	}

	public void setSize(PSize size) {
		this.size = size;
	}

	public PColor getColor() {
		return color;
	}

	public void setColor(PColor color) {
		this.color = color;
	}

	public float getRate() {
		return rate;
	}

	public void setRate(float rate) {
		this.rate = rate;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public List<PReview> getpReview() {
		return pReview;
	}

	public void setpReview(List<PReview> pReview) {
		this.pReview = pReview;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Products() {
		super();
	}

}
