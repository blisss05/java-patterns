package org.factorymethod.impl;

import org.factorymethod.interf.Drink;
import org.factorymethod.interf.DrinkMachine;

/**
 * Created by vzhemev on 4/11/2016.
 */
public class BoschDrinkMachine implements DrinkMachine {

    /**
     * Represents the factory method!
     *
     * @param button
     * @return
     */
    @Override
    public Drink getDrink(Button button) {
        switch (button) {
            case ONE:
                return new Coffee();
            case TWO:
                return new Tea();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
