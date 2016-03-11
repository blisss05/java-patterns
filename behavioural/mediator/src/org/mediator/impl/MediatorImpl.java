package org.mediator.impl;

import org.mediator.interf.Ant;
import org.mediator.interf.Mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by blisss05 on 3/11/2016.
 */
public class MediatorImpl implements Mediator {

    private List<Ant> ants = new ArrayList<>();

    @Override
    public void addAnt(Ant[] antsToAdd) {
        for (Ant ant : antsToAdd) {
            ants.add(ant);
        }
    }

    @Override
    public void sendSignal(Ant.Signal signal, Ant ant) {
        ants.stream().filter(antT -> antT != ant).forEach(antT ->
                antT.acceptSignal(signal)
        );
    }
}
