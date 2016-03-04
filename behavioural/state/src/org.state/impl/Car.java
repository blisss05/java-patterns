package org.state.impl;

import org.state.interf.CarState;

/**
 * Created by blisss05 on 3/4/2016.
 */
public class Car {

    private CarState state = new NormalState();

    public void setState(CarState carState) {
        state = carState;
    }

    public void startEngine() {
        state.startEngine();
    }

    public void drive() {
        state.pressAcceleratePedal();
    }

}
