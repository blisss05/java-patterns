package org.chain.impl.service;

import org.chain.interf.Client;
import org.chain.interf.Service;

/**
 * Created by vzhemev on 4/12/2016.
 */
public class BService implements Service {

    private final Service.ServiceType serviceType = Service.ServiceType.TYPE_B;
    private Service chain;

    @Override
    public void setNextService(Service service) {
        chain = service;
    }

    @Override
    public void doService(Client client) {
        System.out.println("Welcome to B service");
        if (serviceType == client.getServiceType()) {
            System.out.println("B service will provide you the best service");
        }
        else {
            System.out.println("We are sorry B service can not help you.");
            if (chain != null) {
                System.out.println("Perhaps our other service can help you...");
                chain.doService(client);
            }
            else {
                System.out.println("Looks like we cannot help you at this point.");
            }
        }
    }
}
