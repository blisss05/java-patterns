package org.command.impl.command;

import org.command.interf.Character;
import org.command.interf.Command;

/**
 * Created by blisss05 on 3/4/2016.
 */
public class GoForward implements Command {

    private Character character;

    public GoForward(Character characterToUse) {
        character = characterToUse;
    }


    @Override
    public void execute() {
        character.goForward();
    }

    @Override
    public void undo() {
        character.goBack();
    }
}
