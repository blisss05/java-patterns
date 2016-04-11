package org.iterator;

import org.iterator.impl.AClassJournal;
import org.iterator.interf.ClassJournal;
import org.iterator.interf.Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by blisss05 on 3/25/2016.
 */
public class IteratorApp {

    private static List<String> listOfTodayPresent = new ArrayList<>();

    static
    {
        listOfTodayPresent.add("Roman");
        listOfTodayPresent.add("Jim");
        listOfTodayPresent.add("Mike");
    }

    public static void main(String[] args) {

        ClassJournal aClassJ = new AClassJournal();

        Iterator iterator = aClassJ.iterator();

        while (iterator.hasNext()) {
            String pupil = (String) iterator.next();
            if (listOfTodayPresent.contains(pupil)) {
                System.out.println("Pupil " + pupil + " is present today");
            }
            else {
                System.out.println("\tPupil " + pupil + " is not present today");
            }
        }
    }
}
