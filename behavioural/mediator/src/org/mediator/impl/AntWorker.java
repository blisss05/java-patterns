package org.mediator.impl;

import org.mediator.interf.Ant;
import org.mediator.interf.Mediator;

/**
 * Created by blisss05 on 3/11/2016.
 */
public class AntWorker extends Ant {

    public AntWorker(String antName, Mediator mediatorToUse) {
        super(antName, mediatorToUse);
    }

    @Override
    public void work() {
        System.out.println("Ant " + name + " says : I'll work, I like to work!" );

    }

    @Override
    public void fight() {
        System.out.println("Ant " + name + " says : I cannot fight, I like to work!" );
    }
}
