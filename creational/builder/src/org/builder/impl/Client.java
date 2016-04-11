package org.builder.impl;

import org.builder.interf.DrinkMaker;

public class Client {

	private final int quantity;

	private DrinkMaker maker;

	public Client(int quantity) {
		this.quantity = quantity;
	}

	public void setMaker(DrinkMaker maker){
		this.maker = maker;
	}

	public Drink getDrink(){
		return maker.getDrink();
	}

	public void makeDrink() {
		maker.makeNewDrink().setName().setQuantity(quantity);
	}
}
