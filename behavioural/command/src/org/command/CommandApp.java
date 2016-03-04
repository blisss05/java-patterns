package behavioural.command.src.org.command;

import behavioural.command.src.org.command.impl.Player;
import behavioural.command.src.org.command.impl.character.Human;
import behavioural.command.src.org.command.impl.character.Ork;
import behavioural.command.src.org.command.impl.command.GoBack;
import behavioural.command.src.org.command.impl.command.GoForward;
import behavioural.command.src.org.command.impl.command.GoLeft;
import behavioural.command.src.org.command.impl.command.GoRight;
import behavioural.command.src.org.command.interf.Command;

/**
 * Created by blisss05 on 3/4/2016.
 */
public class CommandApp {

    public static void main(String[] args) {
        Human humanChar = new Human("Lancelot");
        Player player1 = new Player(humanChar, "Bob");

        Command commandGoF = new GoForward(humanChar);
        Command commandGoL = new GoLeft(humanChar);
        Command commandGoR = new GoRight(humanChar);
        Command commandGoB = new GoRight(humanChar);

        player1.executeCommand(commandGoF);
        player1.executeCommand(commandGoL);
        player1.undoCommand();
        player1.executeCommand(commandGoB);
        player1.executeCommand(commandGoR);

        System.out.println("\n-----------------------\n");

        Ork orkChar = new Ork("BigGreen");
        Player player2 = new Player(orkChar, "Johny");

        commandGoL = new GoLeft(orkChar);
        commandGoF = new GoForward(orkChar);
        commandGoR = new GoRight(orkChar);
        commandGoB = new GoBack(orkChar);

        player2.placeCommandToQueue(commandGoB);
        player2.placeCommandToQueue(commandGoL);
        player2.placeCommandToQueue(commandGoF);
        player2.placeCommandToQueue(commandGoR);

        player2.executeQueueOfCommands();
    }
}