package org.singleton.senum;

/**
 * Created by vzhemev on 4/12/2016.
 */
public enum Singleton {

    /**
     *  Enum Singleton
     *
     * + Thread safety out of box
     * + Serialization out of box
     * + Supports switch
     * + Ability to use EnumSet, EnumMap
     * - Not lazy init
     */

    INSTANCE;

    public void sayHello() {
        System.out.println("Hello!");
    }
}
