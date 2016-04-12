package org.singleton.doublecheck;

/**
 * Created by vzhemev on 4/12/2016.
 */
public class Singleton {

    /**
     * Double Checked Locking & volatile
     *
     * + Lazy Init
     * + High performance
     * - Supporetd only from jdk 5
     */

    private static volatile Singleton instance;

    private Singleton(){};

    public static Singleton getInstance() {
        Singleton localInstance = instance;
        if (localInstance == null) {
            synchronized (Singleton.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new Singleton();
                }
            }
        }
        return localInstance;
    }

    public void sayHello() {
        System.out.println("Hello!");
    }
}
