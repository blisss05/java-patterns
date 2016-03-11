package org.mediator.impl;

import org.mediator.interf.Ant;
import org.mediator.interf.Mediator;

/**
 * Created by blisss05 on 3/11/2016.
 */
public class AntFighter extends Ant {

    public AntFighter(String antName, Mediator mediatorToUse) {
      super(antName, mediatorToUse);
    }


    @Override
    public void work() {
        System.out.println("Ant " + name + " says : I cannot work I'm a fighter!" );
    }

    @Override
    public void fight() {
        System.out.println("Ant " + name + " says : I'll fight for the Queen" );
    }
}
