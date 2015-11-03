package org.observer.observer;

import org.observer.subject.Subject;

/**
 * Created by blisss05 on 02.11.15.
 */
public interface Observer {

    //method to update the observer, used by subject
    void update();

    //attach with subject to observe
    void setSubject(Subject sub);
}
