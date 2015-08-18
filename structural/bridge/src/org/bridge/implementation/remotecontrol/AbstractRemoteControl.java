package org.bridge.implementation.remotecontrol;

import org.bridge.abstraction.tv.TV;

/**
 * Created by blisss05 on 18.08.15.
 */
public abstract class AbstractRemoteControl {

    //Composition
    protected TV aTv;

    public AbstractRemoteControl(TV aTv) {
        this.aTv = aTv;
    }

    public abstract void turnOn();

    public abstract void turnOff();

    public abstract void setChanel(int chanelNumber);
}
