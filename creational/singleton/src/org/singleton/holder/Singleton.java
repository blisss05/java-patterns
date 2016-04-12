package org.singleton.holder;

/**
 * Created by vzhemev on 4/12/2016.
 */
public final class Singleton {

    /**
     * On Demand Holder idiom
     *
     *  + Lazy init
     *  + High performance
     *  - Cannot use for non static fields
     *
     */

    public static class SingletonHolder {
        public static final Singleton HOLDER_INSTANCE = new Singleton();
    }

    private Singleton(){};

    public static Singleton getInstance() {
        return SingletonHolder.HOLDER_INSTANCE;
    }

    public void sayHello() {
        System.out.println("Hello!");
    }
}
