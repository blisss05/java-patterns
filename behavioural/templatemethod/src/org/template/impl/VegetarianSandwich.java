package org.template.impl;

import org.template.interf.Sandwich;

/**
 * Created by vzhemev on 4/12/2016.
 */
public class VegetarianSandwich extends Sandwich {

    @Override
    public boolean isSpicy() {
        return true;
    }

    @Override
    public boolean isVegetarian() {
        return true;
    }

    @Override
    public void prepareBun() {
        System.out.println("\tPrepared a bun...");
    }

    @Override
    public void addVegetables() {
        System.out.println("\tAdded vegetable..");
    }

    @Override
    public void addMeat() {}

    @Override
    public void addSpices() {
        System.out.println("\tAdded more spices...");
    }
}
