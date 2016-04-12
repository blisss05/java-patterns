package org.template.impl;

import org.template.interf.Sandwich;

/**
 * Created by vzhemev on 4/12/2016.
 */
public class RegularSandwich extends Sandwich {

    @Override
    public void prepareBun() {
        System.out.println("\tPrepared a bun...");
    }

    @Override
    public void addVegetables() {
        System.out.println("\tAdded vegetable..");
    }

    @Override
    public void addMeat() {
        System.out.println("\tAdded meat..");
    }

    @Override
    public void addSpices() {}
}
