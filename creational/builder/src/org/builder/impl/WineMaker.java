package org.builder.impl;

import org.builder.interf.DrinkMaker;

public class WineMaker extends DrinkMaker {

    @Override
    public DrinkMaker setName() {
        drink.setName("wine");
        return this;
    }

    @Override
    public DrinkMaker setQuantity(int quantity) {
        drink.getQuantity(quantity);
        return this;
    }

}
