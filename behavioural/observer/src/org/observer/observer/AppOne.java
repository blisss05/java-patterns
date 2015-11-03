package org.observer.observer;

import org.observer.subject.Subject;

/**
 * Created by blisss05 on 03.11.15.
 */
public class AppOne implements Observer {

    Subject database;
    String data;

    public AppOne(Subject database) {
        this.database = database;
        database.register(this);
    }

    @Override
    public void update() {
        data = (String) database.getUpdate();
        System.out.println("AppOne -> recived updated data.");
    }

    @Override
    public void setSubject(Subject sub) {
        this.database = sub;
    }
}
