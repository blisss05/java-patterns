package org.observer.observer;

import org.observer.subject.Subject;

/**
 * Created by blisss05 on 03.11.15.
 */
public class AppTwo implements Observer {

    Subject database;
    String data;

    public AppTwo(Subject database) {
        this.database = database;
        database.register(this);
    }

    @Override
    public void update() {
        this.data = (String) database.getUpdate();
        System.out.println("AppTwo -> recieved updated data.");
    }

    @Override
    public void setSubject(Subject sub) {
        this.database = database;
    }
}
