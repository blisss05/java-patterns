package org.singleton.staticfield;

/**
 * Created by vzhemev on 4/12/2016.
 */
public class Singleton {

    /**
     * Static field
     *
     * + Thread safety
     * + Simple and clear
     * - Not lazy init
     *
     */

    public static final Singleton INSTANCE = new Singleton();

    private Singleton(){};

    public void sayHello() {
        System.out.println("Hello!");
    }
}
