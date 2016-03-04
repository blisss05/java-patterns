package behavioural.command.src.org.command.impl;

import behavioural.command.src.org.command.interf.Character;
import behavioural.command.src.org.command.interf.Command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bliss05 on 3/4/2016.
 */
public class Player {

    private Character character;
    private String name;

    private Command command;
    private List<Command> commands = new ArrayList<>();

    public Player(Character characterToPlay, String playerName) {
        character = characterToPlay;
        name = playerName;
    }

    public void executeCommand(Command commandToExecute) {
        System.out.println("Player " + name + " is playing...");
        command = commandToExecute;
        commandToExecute.execute();
    }

    public void undoCommand() {
        System.out.println("Player " + name + " is playing...");
        if (command != null) {
            command.undo();
        }
        else {
            throw new IllegalStateException();
        }
    }

    public void placeCommandToQueue(Command commandToPlaceInQ) {
        commands.add(commandToPlaceInQ);
    }

    public void executeQueueOfCommands() {
        System.out.println("Player " + name + " is playing...");
        for (Command command : commands) {
            command.execute();
        }
    }
}
