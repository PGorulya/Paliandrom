package org.example;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Paliandrom {

    private String s;

    public Paliandrom(String s) {
        this.s = s;
    }

    boolean isPaliandrom () {

        List<Character> list = new LinkedList<>();

        int length = s.length();
        for (int i = 0; i < length; i++) {
            list.add(s.charAt(i));
        }

        ListIterator<Character> iteratorFor =  list.listIterator();
        ListIterator<Character> iteratorBack = list.listIterator(list.size());

        boolean isPolindrom = true;

        while ( (iteratorFor.hasNext() && iteratorBack.hasPrevious()) &&
                (iteratorFor.nextIndex() != iteratorBack.previousIndex())) {

            if (iteratorFor.next() != iteratorBack.previous()) {
                isPolindrom = false;
                break;
            }
        }
        return isPolindrom;
    }
}
