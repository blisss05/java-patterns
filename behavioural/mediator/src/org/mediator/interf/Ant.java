package org.mediator.interf;

/**
 * Created by blisss05 on 3/11/2016.
 */
public abstract class Ant {

    public enum Signal {
        WORK("'Please work'"), FIGHT("'You need to fight'");

        final String message;

        Signal(String msg) {
            message = msg;
        }

    }

    protected final String name;
    protected final Mediator mediator;

    public Ant(String antName, Mediator mediatorToUse){
        name = antName;
        mediator = mediatorToUse;
    }

    public abstract void work();

    public abstract void fight();

    public void acceptSignal(Signal signal) {
        System.out.println("Ant " + name + " received a signal " + signal.message);
        switch (signal) {
            case WORK: {
                work();
                break;
            }
            case FIGHT: {
                fight();
                break;
            }
            default: {
                System.out.println("Don't know what to do :(");
            }
        }
    }

    public void sendSignal(Signal signal) {
        System.out.println("\nAnt " + name + " is sending a signal " + signal.message + "\n");
        mediator.sendSignal(signal, this);
    }
}
