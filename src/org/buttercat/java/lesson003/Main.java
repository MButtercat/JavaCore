package org.buttercat.java.lesson003;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class listHelper {
    private ArrayList<Integer> l3, l5, l35;
    public listHelper() {
        l3 = new ArrayList<Integer>();
        l5 = new ArrayList<Integer>();
        l35 = new ArrayList<Integer>();
    }

    public void addToL3(Integer i) {
        l3.add(i);
    }
    public void addToL5(Integer i) {
        l5.add(i);
    }
    public void addToL35(Integer i) {
        l35.add(i);
    }

    public ArrayList<Integer> getL3() {
        return l3;
    }
    public ArrayList<Integer> getL5() {
        return l5;
    }
    public ArrayList<Integer> getL35() {
        return l35;
    }
}

public class Main {
    final static int oddMax = 99;
    public static void main(String[] args) {
        lesson3 l3 = new lesson3();
// Task 1
        try {
            System.out.print("list of first " + oddMax + " numbers: ");
            for (Integer i : l3.oddGen(oddMax)) {
                System.out.print(i + (i < oddMax-1 ? ", " : "\n"));
            }
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
// Task 2
        try {
            listHelper lm = l3.commonMultiples(oddMax+1);
            System.out.print("List of numbers with multiple 3: ");
            for (Integer i : lm.getL3()) {
                System.out.print(i + (i < Collections.max(lm.getL3()) ? ", " : "\n"));
            }
            System.out.print("List of numbers with multiple 5: ");
            for (Integer i : lm.getL5()) {
                System.out.print(i + (i < Collections.max(lm.getL5()) ? ", " : "\n"));
            }
            System.out.print("List of numbers with multiples 3 and 5: ");
            for (Integer i : lm.getL35()) {
                System.out.print(i + (i < Collections.max(lm.getL35()) ? ", " : "\n"));
            }
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
