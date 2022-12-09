package com.komsoft.shopmvc.model;

import java.util.Objects;

public class Product {
	private long id;
	private String name;
	private String description;
	private double price;
	private Category category;

	public Product setId(long id) {
		this.id = id;
		return this;
	}

	public Product setName(String name) {
		this.name = name;
		return this;
	}

	public Product setDescription(String description) {
		this.description = description;
		return this;
	}

	public Product setPrice(double price) {
		this.price = price;
		return this;
	}

	public Product setCategory(Category category) {
		this.category = category;
		return this;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public double getPrice() {
		return price;
	}

	public Category getCategory() {
		return category;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return id == other.id;
	}
/*
	@Override
	public int hashCode() {
		return Integer.valueOf((int) getId());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Product))
			return false;
		Product other = (Product) obj;
		return getId() == that.getId();
	}
*/

}
