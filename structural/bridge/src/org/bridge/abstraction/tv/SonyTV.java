package org.bridge.abstraction.tv;

/**
 * Created by blisss05 on 18.08.15.
 */
public class SonyTV implements TV {
    @Override
    public void turnOn() {
        System.out.println("\tTurn on Sony TV...");
    }

    @Override
    public void turnOff() {
        System.out.println("\tTurn off Sony TV...");
    }

    @Override
    public void switchChanel(int chanelNumber) {
        System.out.println("\tSwitch chanel on Sony TV to " + chanelNumber);
    }
}
