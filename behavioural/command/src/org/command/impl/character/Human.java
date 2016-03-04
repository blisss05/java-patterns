package behavioural.command.src.org.command.impl.character;

import behavioural.command.src.org.command.interf.Character;

/**
 * Created by blisss05 on 3/4/2016.
 */
public class Human extends Character {

    public Human(String orkName) {
        name = orkName;
    }

    @Override
    public void goForward() {
        System.out.println("Human " + name + " moved forward...");
    }

    @Override
    public void goBack() {
        System.out.println("Human " + name + " moved back...");
    }

    @Override
    public void goLeft() {
        System.out.println("Human " + name + " moved left...");
    }

    @Override
    public void goRight() {
        System.out.println("Human " + name + " moved right...");
    }
}
