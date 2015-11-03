package org.observer.subject;

import org.observer.observer.Observer;

/**
 * Created by blisss05 on 02.11.15.
 */
public interface Subject {

    //methods to register and unregister observers
    void register(Observer observer);
    void unregister(Observer observer);

    //method to notify observers of subject change
    void notifyObservers();

    //method to get updates from subject
    Object getUpdate();

    void setState(Object state);
}
