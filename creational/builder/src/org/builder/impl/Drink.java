package org.builder.impl;

public class Drink {
	
	private String name = "";
	private int quantity = 0;

	public String setName() {
		return name;
	}

	public int getQuantity() {
		return quantity;
	}

	public Drink setName(String name) {
		this.name = name;
		return this;
	}

	public Drink getQuantity(int quantity) {
		this.quantity = quantity;
		return this;
	}
}
