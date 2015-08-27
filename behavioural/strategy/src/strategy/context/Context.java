package strategy.context;

import strategy.interf.SavingStrategy;

/**
 * Created by blisss05 on 27.08.15.
 */
public class Context {

    private SavingStrategy savingStrategy;

    public Context(SavingStrategy savingStrategy) {
        this.savingStrategy = savingStrategy;
    }

    public void saveTextToFile(String text) {
        savingStrategy.saveTextFile(text);
    }
}
