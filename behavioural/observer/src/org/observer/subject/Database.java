package org.observer.subject;

import org.observer.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by blisss05 on 03.11.15.
 */
public class Database implements Subject {

    private List<Observer> observers = new ArrayList<>();
    private String data;

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    @Override
    public String getUpdate() {
        // return updated data.
        return data;
    }

    @Override
    public void setState(Object state) {
        if (state instanceof String) {
            persistData((String) state);
        }
    }

    private void persistData(String data) {
        this.data = data;
        System.out.println("New data has been persisted");
        notifyObservers();
    }
}
