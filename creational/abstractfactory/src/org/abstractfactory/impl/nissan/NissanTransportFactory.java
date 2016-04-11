package org.abstractfactory.impl.nissan;

import org.abstractfactory.interf.Bus;
import org.abstractfactory.interf.Car;
import org.abstractfactory.interf.ITransportFactory;

/**
 * Created by vzhemev on 4/11/2016.
 */
public class NissanTransportFactory implements ITransportFactory {
    @Override
    public Car getCar() {
        return new NissanCar();
    }

    @Override
    public Bus getBus() {
        return new NissanBus();
    }
}
