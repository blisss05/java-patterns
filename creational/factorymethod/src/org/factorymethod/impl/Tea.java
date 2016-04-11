package org.factorymethod.impl;

import org.factorymethod.interf.Drink;

/**
 * Created by vzhemev on 4/11/2016.
 */
public class Tea implements Drink {


    @Override
    public String getName() {
        return "Tea (Green with fruits flavor)";
    }
}
