package org.buttercat.java.lesson006;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PrimalUser {

    int age;

    {
        age = 0;
    }

    public PrimalUser() {
        System.out.print("Enter user age: ");
        try {
            age = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        }
        catch (Exception e) {
            return;
        }
    }

    public void getInfo() {
        System.out.print("User age: " + this.age);
    }
}
