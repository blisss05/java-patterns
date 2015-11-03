package org.strategy.concrete;

import org.strategy.interf.SavingStrategy;

/**
 * Created by blisss05 on 27.08.15.
 */
public class SavingToRTFStrategy implements SavingStrategy {
    @Override
    public void saveTextFile(String text) {
        System.out.println("Saving  [ " + text + " ] to a file with *.rtf format");
    }
}
