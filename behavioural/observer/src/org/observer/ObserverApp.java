package org.observer;

import org.observer.observer.AppOne;
import org.observer.observer.AppTwo;
import org.observer.observer.Observer;
import org.observer.subject.Database;
import org.observer.subject.Subject;

/**
 * Created by blisss05 on 03.11.15.]
 *
 * Observer pattern is one of the behavioral design pattern. Observer design pattern is useful when
 * you are interested in the state of an object and want to get notified whenever there is any change.
 * In observer pattern, the object that watch on the state of another object are called Observer and
 * the object that is being watched is called Subject. According to GoF, observer pattern intent is;
 *
 * Define a one-to-many dependency between objects so that when one object changes state,
 * all its dependents are notified and updated automatically.
 *
 * In this example we have a database and two app which are notified whenever there is a change
 * to the database.
 *
 */
public class ObserverApp {

    public static void main(String[] args) {
        Subject database = new Database();

        Observer appOne = new AppOne(database);
        Observer appTwo = new AppTwo(database);

        database.setState("Very important data.");
    }
    /**
     * Output:
     *
     * New data has been persisted
     * AppOne -> received updated data.
     * AppTwo -> received updated data.
     *
     */
}
