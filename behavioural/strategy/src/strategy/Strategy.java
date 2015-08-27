package strategy;

import strategy.concrete.SavingToRTFStrategy;
import strategy.context.Context;
import strategy.interf.SavingStrategy;

/**
 * Created by blisss05 on 27.08.15.
 */
public class Strategy {

    public static void main(String[] args) {
        SavingStrategy savingStrategy = new SavingToRTFStrategy();
        Context context = new Context(savingStrategy);

        String textToBeSave = "I'm text and want to be saved";
        context.saveTextToFile(textToBeSave);
    }
}
