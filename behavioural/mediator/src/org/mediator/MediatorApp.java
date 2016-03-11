package org.mediator;

import org.mediator.impl.AntFighter;
import org.mediator.impl.AntWorker;
import org.mediator.impl.MediatorImpl;
import org.mediator.interf.Ant;
import org.mediator.interf.Mediator;

/**
 * Created by blisss05 on 3/11/2016.
 */
public class MediatorApp {

    public static void main(String[] args) {
        Mediator mediator = new MediatorImpl();

        Ant ant1 = new AntWorker("Johny", mediator);
        Ant ant2 = new AntFighter("Leonid", mediator);
        Ant ant3 = new AntWorker("Bob", mediator);
        Ant ant4 = new AntFighter("Muhamed", mediator);

        mediator.addAnt(ant1, ant2, ant3, ant4);

        ant1.sendSignal(Ant.Signal.WORK);

        ant2.sendSignal(Ant.Signal.FIGHT);
    }
}
