package org.factorymethod.impl;

import org.factorymethod.interf.Drink;

/**
 * Created by vzhemev on 4/11/2016.
 */
public class Coffee implements Drink {
    @Override
    public String getName() {
        return "Coffee (Black Americano)";
    }
}
