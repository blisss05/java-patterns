package org.abstractfactory.impl.volvo;

import org.abstractfactory.interf.Car;

/**
 * Created by vzhemev on 4/11/2016.
 */
public class VolvoCar implements Car {

    @Override
    public String getModel() {
        return "Volvo S60";
    }
}
