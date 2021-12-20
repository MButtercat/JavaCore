package org.buttercat.java.lesson006;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FlyingMachine {

    class Wing {
        int weight;

        public void setWeight(int w) {
            weight = w;
        }

        public int getWeight() {
            return weight;
        }
    }

    Wing w;
    String name;

    {
        w = new Wing();
        name = new String();
    }

    public FlyingMachine() {
        try {
            System.out.println("Enter airplan name: ");
            name = new BufferedReader(new InputStreamReader(System.in)).readLine();
            System.out.println("Enter wing weight: ");
            w.setWeight(Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine()));
        }
        catch (Exception e) {
            return;
        }
    }

    public void getInfo() {
        System.out.println(name + " have wing with " + w.getWeight() + " kg");
    }

}