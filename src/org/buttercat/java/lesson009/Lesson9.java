package org.buttercat.java.lesson009;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.concurrent.ThreadLocalRandom;

public class Lesson9 {

    public static TreeSet<Integer> getUnique(ArrayList<Integer> vals) {
        return new TreeSet<Integer>(vals);
    }

    public static ArrayList<Integer> generateArrayList() {
        ArrayList<Integer> a = new ArrayList<Integer>();
        for(long i = 0; i < 1000000; i++) {
            a.add(ThreadLocalRandom.current().nextInt(Integer.MIN_VALUE, Integer.MAX_VALUE));
        }
        return a;
    }

    public static LinkedList<Integer> generateLinkedList() {
        LinkedList<Integer> a = new LinkedList<Integer>();
        for(long i = 0; i < 1000000; i++) {
            a.add(ThreadLocalRandom.current().nextInt(Integer.MIN_VALUE, Integer.MAX_VALUE));
        }
        return a;
    }

    public static ArrayList<Integer> getNewArrayList(ArrayList<Integer> a){
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        for (long i = 0; i < 100/*000*/; i++) { //Если я забуду раскментировать, то знайте, что у меня слишком сильно лагает
            a1.add(a.get(ThreadLocalRandom.current().nextInt(1000000)));
        }
        return a1;
    }

    public static LinkedList<Integer> getNewArrayList(LinkedList<Integer> a){
        LinkedList<Integer> a1 = new LinkedList<Integer>();
        for (long i = 0; i < 100/*000*/; i++) { //Если я забуду раскментировать, то знайте, что у меня слишком сильно лагает
            a1.add(a.get(ThreadLocalRandom.current().nextInt(1000000)));
        }
        return a1;
    }
}