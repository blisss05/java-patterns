package org.mediator.interf;

/**
 * Created by blisss05 on 3/11/2016.
 */
public interface Mediator {

    public abstract void addAnt(Ant... ant);

    public abstract void sendSignal(Ant.Signal signal, Ant ant);
}
