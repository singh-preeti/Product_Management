package com.product.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	
	@Id
	private long id;
	private String prod_name;
	private double price;
	private String type;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(long id, String prod_name, double price, String type) {
		super();
		this.id = id;
		this.prod_name = prod_name;
		this.price = price;
		this.type = type;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getProd_name() {
		return prod_name;
	}
	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	
	

}
