package org.iterator.impl;

import org.iterator.interf.ClassJournal;
import org.iterator.interf.Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by blisss05 on 3/25/2016.
 */
public class AClassJournal implements ClassJournal {

    private List<String> list = new ArrayList<>();
    {
        // list of all students
        list.add("Volodymyr");
        list.add("Roman");
        list.add("Boby");
        list.add("John");
        list.add("Jim");
        list.add("Kenny");
        list.add("Mike");
    }

    @Override
    public Iterator iterator() {
        return new JournalIterator();
    }

    private class JournalIterator implements Iterator {

        private int position = 0;

        @Override
        public boolean hasNext() {
            if (position < list.size()) {
                return true;
            }
            else {
                return false;
            }
        }

        @Override
        public Object next() {
            if (hasNext()) {
                return list.get(position++);
            }
            else {
                return null;
            }
        }
    }
}
