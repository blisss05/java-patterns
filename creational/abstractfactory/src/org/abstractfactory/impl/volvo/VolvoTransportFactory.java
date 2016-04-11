package org.abstractfactory.impl.volvo;

import org.abstractfactory.interf.Bus;
import org.abstractfactory.interf.Car;
import org.abstractfactory.interf.ITransportFactory;

/**
 * Created by vzhemev on 4/11/2016.
 */
public class VolvoTransportFactory implements ITransportFactory {
    @Override
    public Car getCar() {
        return new VolvoCar();
    }

    @Override
    public Bus getBus() {
        return new VolvoBus();
    }
}
