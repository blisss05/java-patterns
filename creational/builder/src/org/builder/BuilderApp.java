package org.builder;

import org.builder.impl.Client;
import org.builder.impl.WineMaker;
import org.builder.interf.DrinkMaker;

public class BuilderApp {

	public static void main(String args[]){
		/**
		 * In this case we have a client and a drink maker interface
		 * which can be used to build a drink. A particular implementation
		 * of the drink maker it's a builder.
		 *
		 */
		int clientWantsToDrink = 1;
		Client client = new Client(clientWantsToDrink);

		//DrinkMaker drinkMaker  = new BeerMaker();
		DrinkMaker drinkMaker = new WineMaker();

		client.setMaker(drinkMaker);

		client.makeDrink();

		System.out.println("Name of drink " + client.getDrink().setName() + " and quantity " + client.getDrink().getQuantity());
	}
	/**
	 * Output:
	 *
	 * Name of drink wine and quantity 1
	 *
	 */
}
