package org.buttercat.java.lesson006;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EvolveUser extends PrimalUser {

    String name;
    {
        name = new String();
    }

    public EvolveUser() {
        System.out.print("Enter user name: ");
        try {
            name = new BufferedReader(new InputStreamReader(System.in)).readLine();
        }
        catch (Exception e) {
            return;
        }
    }

    @Override
    public void getInfo() {
        System.out.println(name + " is " + super.age + " years old");
    }
}