package org.chain.interf;

/**
 * Created by vzhemev on 4/12/2016.
 */
public interface Service {

    public static enum ServiceType {
        TYPE_A, TYPE_B, TYPE_C
    }

    public abstract void setNextService(Service service);

    public abstract void doService(Client client);
}
