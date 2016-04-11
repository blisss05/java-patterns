package org.builder.impl;

import org.builder.interf.DrinkMaker;

public class BeerMaker extends DrinkMaker {

	@Override
	public DrinkMaker setName() {
		drink.setName("beer");
		return this;
	}

	@Override
	public DrinkMaker setQuantity(int quantity) {
		drink.getQuantity(quantity);
		return this;
	}
}
