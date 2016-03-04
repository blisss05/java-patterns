package org.state.impl;

import org.state.interf.CarState;

/**
 * Created by vzhemev on 3/4/2016.
 */
public class NoFuelState implements CarState {
    @Override
    public void startEngine() {
        System.out.println("Rrrrr...Cannot start engine without fuel");
    }

    @Override
    public void pressAcceleratePedal() {
        System.out.println("Car is not moving...No fuel");
    }
}
