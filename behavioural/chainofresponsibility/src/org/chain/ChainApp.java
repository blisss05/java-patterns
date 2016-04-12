package org.chain;

import org.chain.impl.ReqularClient;
import org.chain.impl.service.AService;
import org.chain.impl.service.BService;
import org.chain.interf.Client;
import org.chain.interf.Service;

/**
 * Created by vzhemev on 4/12/2016.
 */
public class ChainApp {

    public static void main(String[] args) {
        /**
         * In this example we have a chain of services.
         * A client which has a service type can be served
         * only by a particular service in the chain.
         */
        Service service1 = new BService();
        Service service2 = new AService();

        service1.setNextService(service2);

        Client client = new ReqularClient();

        service1.doService(client);
    }
    /**
     * Output:
     *
     * Welcome to B service
     * We are sorry B service can not help you.
     * Perhaps our other service can help you...
     * Welcome to A service
     * A service will provide you the best service
     *
     */
}
