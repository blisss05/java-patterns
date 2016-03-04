package org.strategy;

import org.strategy.context.Context;
import org.strategy.concrete.SavingToRTFStrategy;
import org.strategy.interf.SavingStrategy;

/**
 * Created by blisss05 on 27.08.15.
 *
 * Strategy pattern is one of the behavioral design pattern. Strategy pattern is used
 * when we have multiple algorithm for a specific task and client decides the actual
 * implementation to be used at runtime.
 *
 * Strategy pattern is also known as Policy Pattern. We defines multiple algorithms and
 * let client application pass the algorithm to be used as a parameter. One of the best
 * example of this pattern is Collections.sort() method that takes Comparator parameter.
 * Based on the different implementations of Comparator interf, the Objects are getting
 * sorted in different ways, check this post for sorting objects in java using
 * Java Comparable and Comparator.
 *
 * In this example we have an interface for saving text to file. We have two saving strategy
 * one is to safe text in TXT format another is to save text in RTF format.
 *
 */
public class Strategy {

    public static void main(String[] args) {
        SavingStrategy savingStrategy = new SavingToRTFStrategy();
        Context context = new Context(savingStrategy);

        String textToBeSave = "I'm text and want to be saved";
        context.saveTextToFile(textToBeSave);
    }
}
