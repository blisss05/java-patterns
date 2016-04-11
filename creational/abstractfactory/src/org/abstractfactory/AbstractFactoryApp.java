package org.abstractfactory;

import org.abstractfactory.impl.nissan.NissanTransportFactory;
import org.abstractfactory.interf.ITransportFactory;

/**
 * Created by vzhemev on 4/11/2016.
 */
public class AbstractFactoryApp {

    public static void main(String[] args) {

        // Create our factory. This allows us easelly access
        // different object related to some specific domain. In our case
        // it will be products of the Nissan transport factory.
        ITransportFactory factory = new NissanTransportFactory();

        System.out.println("We have a car model [ "  +  factory.getCar().getModel() + " ]");
        System.out.println("We have a bus model [ "  +  factory.getBus().getModel() + " ]");
    }

    /**
     * Output:
     *
     * We have a car model [ Nissan 350Z ]
     * We have a bus model [ Nissan Alexander Dennis Enviro350H ]
     *
     */
}
