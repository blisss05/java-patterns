package org.bridge;

import org.bridge.abstraction.tv.TV;
import org.bridge.implementation.remotecontrol.LogitechReomteControl;
import org.bridge.abstraction.tv.SonyTV;
import org.bridge.implementation.remotecontrol.AbstractRemoteControl;

/**
 * Created by blisss05 on 18.08.15.
 *
 *
 * The bridge pattern is meant to "decouple an abstraction from its implementation
 * so that the two can vary independently".
 *
 * Usage of Bridge Pattern
 *
 * - When you don't want a permanent binding between the functional abstraction and its implementation.
 * - When both the functional abstraction and its implementation need to extended using sub-classes.
 * - It is mostly used in those places where changes are made in the implementation does not affect the clients.
 *
 * In a nutshell, Bridget pattern gives two layers abstraction of implementation, in this case, TV and remote control.
 *
 */
public class Bridge {

    private static final int A_TEST_CHANEL = 5;

    public static void main(String args[]) {
        TV aTv = new SonyTV();
        AbstractRemoteControl remoteCtr = new LogitechReomteControl(aTv);

        remoteCtr.turnOn();
        remoteCtr.setChanel(A_TEST_CHANEL);
        remoteCtr.turnOff();
    }

    /**
     * Output:
     *
     * Logitech remote control was used to ->
     *   Turn on Sony TV...
     * Logitech remote control was used to ->
     *   Switch chanel on Sony TV to 5
     * Logitech remote control was used to ->
     *   Turn off Sony TV...
     *
     */
}
