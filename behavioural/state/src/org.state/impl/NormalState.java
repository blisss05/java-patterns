package org.state.impl;

import org.state.interf.CarState;

/**
 * Created by blisss05 on 3/4/2016.
 */
public class NormalState implements CarState {


    @Override
    public void startEngine() {
        System.out.println("Engine started..Rrrrr");
    }

    @Override
    public void pressAcceleratePedal() {
        System.out.println("Car is moving...");
    }
}
