package org.bridge.implementation.remotecontrol;

import org.bridge.abstraction.tv.TV;

/**
 * Created by blisss05 on 18.08.15.
 */
public class LogitechReomteControl extends AbstractRemoteControl{

    public LogitechReomteControl(TV aTv) {
        super(aTv);
    }

    @Override
    public void turnOn() {
        System.out.println("Logitech remote control was used to ->");
        aTv.turnOn();
    }

    @Override
    public void turnOff() {
        System.out.println("Logitech remote control was used to ->");
        aTv.turnOff();
    }

    @Override
    public void setChanel(int chanelNumber) {
        System.out.println("Logitech remote control was used to ->");
        aTv.switchChanel(chanelNumber);
    }
}
