package org.command.impl.command;

import org.command.interf.Character;
import org.command.interf.Command;

/**
 * Created by vzhemev on 3/4/2016.
 */
public class GoBack implements Command {

    private Character character;

    public GoBack(Character characterToUse) {
        character = characterToUse;
    }

    @Override
    public void execute() {
        character.goBack();
    }

    @Override
    public void undo() {
        character.goForward();
    }
}
