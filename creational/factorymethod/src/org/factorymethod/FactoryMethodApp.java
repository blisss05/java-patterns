package org.factorymethod;

import org.factorymethod.impl.BoschDrinkMachine;
import org.factorymethod.interf.Drink;
import org.factorymethod.interf.DrinkMachine;

/**
 * Created by vzhemev on 4/11/2016.
 */
public class FactoryMethodApp {

    public static void main(String[] args) {

        // In this example we have a drink machine
        // which has a factory method. The factory method
        // based on input argument (which is Button enum instance)
        // creates a concrete implementation of Drink interface
        DrinkMachine drinkMachine = new BoschDrinkMachine();
        Drink drink = drinkMachine.getDrink(DrinkMachine.Button.ONE);

        System.out.println("You chose [ " + drink.getName() +  " ]");
    }
}
