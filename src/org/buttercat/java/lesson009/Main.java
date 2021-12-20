package org.buttercat.java.lesson009;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

class Main {
    public static void main(String[] args) {

// Task 2
        System.out.println(" ------ Task 2 ------ \n");

        ArrayList<Integer> a = new ArrayList<Integer>();

        int aSz = ThreadLocalRandom.current().nextInt(500, 600);
        for (int i = 0; i < aSz; i++) {
            a.add(ThreadLocalRandom.current().nextInt(0, 10));
        }

        System.out.println("Our ArrayList has " + a.size() + " elements with elements from " + Lesson9.getUnique(a));

// Task 3
        System.out.println("\n ------ Task 3 ------ \n");

        ArrayList<Integer> a1 = Lesson9.generateArrayList();
        LinkedList<Integer> a2 = Lesson9.generateLinkedList();

        System.out.println("We have two different arrays with 1000000 elements in each other");

        System.out.print("Lets count the time of getting of 100000 elements from ArrayList: ");
        long start = System.currentTimeMillis();
        ArrayList<Integer> _a1 = Lesson9.getNewArrayList(a1);
        System.out.println(System.currentTimeMillis() - start + " ms");

        System.out.print("Lets count the time of getting of 100000 elements from LinkedList: ");
        start = System.currentTimeMillis();
        LinkedList<Integer> _a2 = Lesson9.getNewArrayList(a2);
        System.out.println(System.currentTimeMillis() - start + " ms");

        System.out.println("As we can see when we get a random element from LinkedList we have to refer each element from begin to specified index");

// Task 4
        System.out.println("\n ------ Task 4 ------ \n");

        class User {
            private String name;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public User(String name) {
                this.name = name;
            }
        }

        Map<User, Integer> m = new HashMap<User, Integer>();

        m.put(new User("Michelangelo"), 1000);
        m.put(new User("Leonardo"),     100);
        m.put(new User("Raphael"),      10);
        m.put(new User("Donatello"),    1);

        try {
            System.out.print("Enter name: ");
            boolean isFound = false;
            String name = new BufferedReader(new InputStreamReader(System.in)).readLine();
            for (Map.Entry<User, Integer> _m : m.entrySet()) {
                if(_m.getKey().getName().equals(name)) {
                    isFound = true;
                    System.out.println(name + " has " + _m.getValue() + " pt");
                }
            }
            if(!isFound) {
                System.out.println("we can't find " + name + "'s points");
            }
        }
        catch (IOException e) {
            System.out.println("We have some problem");
        }
    }
}