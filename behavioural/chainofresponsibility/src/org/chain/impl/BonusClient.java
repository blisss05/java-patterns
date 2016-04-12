package org.chain.impl;

import org.chain.interf.Client;
import org.chain.interf.Service;

/**
 * Created by vzhemev on 4/12/2016.
 */
public class BonusClient implements Client {

    private final Service.ServiceType serviceType = Service.ServiceType.TYPE_A;


    @Override
    public Service.ServiceType getServiceType() {
        return serviceType;
    }
}
