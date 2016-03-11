package org.state;

import org.state.impl.Car;
import org.state.impl.NoFuelState;

/**
 * Created by blisss05 on 3/4/2016.
 */
public class StateApp {

    public static void main(String[] args) {
        Car lamborghini = new Car();
        lamborghini.startEngine();
        lamborghini.drive();

        lamborghini.setState(new NoFuelState());
        lamborghini.startEngine();
        lamborghini.drive();
    }

    /**
     * Output:
     *
     * Engine started..Rrrrr
     * Car is moving...
     * Rrrrr...Cannot start engine without fuel
     * Car is not moving...No fuel
     *
     */
}
