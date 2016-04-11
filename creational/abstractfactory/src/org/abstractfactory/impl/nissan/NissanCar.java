package org.abstractfactory.impl.nissan;

import org.abstractfactory.interf.Car;

/**
 * Created by vzhemev on 4/11/2016.
 */
public class NissanCar implements Car {
    @Override
    public String getModel() {
        return "Nissan 350Z";
    }
}
