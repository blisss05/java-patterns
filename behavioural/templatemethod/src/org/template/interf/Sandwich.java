package org.template.interf;

/**
 * Created by vzhemev on 4/12/2016.
 */
public abstract class Sandwich {

    public boolean isVegetarian() {
        return false; // default value
    }

    public boolean isSpicy() {
        return false; // default value
    }

    public abstract void prepareBun();
    public abstract void addVegetables();
    public abstract void addMeat();
    public abstract void addSpices();

    public void makeSandwich() {
        System.out.println("Making your sandwich...");
        prepareBun();
        addVegetables();
        if (!isVegetarian()) {
            addMeat();
        }
        if (isSpicy()) {
            addSpices();
        }
        System.out.println("Your sandwich is ready!");
    }

}
