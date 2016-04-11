package org.factorymethod.interf;

/**
 * Created by vzhemev on 4/11/2016.
 */
public interface DrinkMachine {

    public static enum Button {
        ONE, TWO
    }

    public Drink getDrink(Button button);

}
