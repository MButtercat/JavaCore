package org.buttercat.java.lesson003;
import java.util.ArrayList;

public class lesson3 {
    public ArrayList<Integer> oddGen(int max) throws IllegalArgumentException {
        if(max <= 0)
            throw new IllegalArgumentException("Invalid argument");
        ArrayList<Integer> l = new ArrayList<Integer>();
        for(int i = 1; i <= max; ++i) {
            if(i%2 == 1)
                l.add(i);
        }
        return l;
    }
    public listHelper commonMultiples(int max) throws IllegalArgumentException {
        if(max <= 0)
            throw new IllegalArgumentException("Invalid argument");
        listHelper l = new listHelper();
        for(int i = 1; i <= max; ++i) {
            if(i%3 == 0) {
                l.addToL3(i);
            }
            if(i%5 == 0) {
                l.addToL5(i);
            }
        }
        for (Integer i3 : l.getL3()) {
            if(l.getL5().contains(i3)) {
                l.addToL35(i3);
            }

        }
        return l;
    }
    public boolean isSumCorrect(Integer[] i) throws IllegalArgumentException {
        if(i.length != 3)
            throw new IllegalArgumentException("Invalid argument");
        return i[0]+i[1] == i[2];
    }

    public boolean isCompCorrect(Integer[] i) throws IllegalArgumentException {
        if(i.length != 3)
            throw new IllegalArgumentException("Invalid argument");
        return ((i[0].intValue() < i[1].intValue()) & (i[1].intValue() < i[2].intValue()));
    }
}
