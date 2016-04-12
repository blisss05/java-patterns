package org.singleton.lazy;

/**
 * Created by vzhemev on 4/12/2016.
 */
public class Singleton {

    /**
     * Synchronized Accessor
     *
     * + Lazy init
     * - Low performance
     */

    private static Singleton instance;

    private Singleton(){};

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void sayHello() {
        System.out.println("Hello!");
    }
}
