package org.builder.interf;

import org.builder.impl.Drink;

public abstract class DrinkMaker {

	protected Drink drink;

	public Drink getDrink() {
		return drink;
	}

	public DrinkMaker makeNewDrink(){
		drink = new Drink();
		return this;
	}

	public abstract DrinkMaker setName();
	public abstract DrinkMaker setQuantity(int quantity);

}
