package org.buttercat.java.lesson006;

import java.util.concurrent.ThreadLocalRandom;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {

// Task 1a
        System.out.println(" ------ Task 1a ------ \n");

        Lorry l = new Lorry(100, "Peterbilt", 'r', 101.5f, 10, 1500);
        l.newWheels(12);
        l.outPut();

// Task 2a
        System.out.println("\n ------ Task 2a ------ \n");
        ChildClass c = new ChildClass(99);
        c.getInt();

// Task 3a
        System.out.println("\n ------ Task 3a ------ \n");

        EvolveUser u = new EvolveUser();
        u.getInfo();

// Task 4a and 5a
        System.out.println("\n ------ Task 4a and 5a ------ \n");

        FlyingMachine atp = new FlyingMachine();
        FlyingMachine bac = new FlyingMachine();

        atp.getInfo();
        bac.getInfo();

// Task 1b
        System.out.println("\n ------ Task 1b ------ \n");

        System.out.println("We able to use interfaces for more specialisation our children classes.");
        System.out.println("For example, we can find the best client and the best employee using the same method but different ways.");
        System.out.println("In this task we using interfase \"comparable\".");

        ArrayList<NonAbstractClient> clL = new ArrayList<NonAbstractClient>();
        clL.add(new NonAbstractClient("Mike", "Buttercat", "MyBank", 10000));
        clL.add(new NonAbstractClient("Cat", "ButterMike", "MyBank", 1000));
        clL.add(new NonAbstractClient("Butter", "MikeCat", "MyBank", 100));

        ArrayList<NonAbstractBankEmployee> emL = new ArrayList<NonAbstractBankEmployee>();
        emL.add(new NonAbstractBankEmployee("Petr", "Petrov", "MyBank", 100,   10000));
        emL.add(new NonAbstractBankEmployee("Ivan", "Ivanov", "MyBank", 1000,  1000));
        emL.add(new NonAbstractBankEmployee("Sasha", "Sashev", "MyBank", 10000, 100));

        System.out.println("");
        System.out.println("So we have these clients:");
        for(NonAbstractClient cl : clL) {
            System.out.println(cl);
        }

        System.out.println("");
        System.out.println("And these employees:");
        for(NonAbstractBankEmployee em : emL) {
            System.out.println(em);
        }

        System.out.println("");
        System.out.println("Now we can find the best client using Collections.max:");
        NonAbstractClient bestClient = Collections.max(clL);
        System.out.println(bestClient.getName() + " because he(she) has " + bestClient.accountMoney + "$ in his(her) bank account");

        System.out.println("");
        System.out.println("And the best eployee using Collections.max:");
        NonAbstractBankEmployee bestEmployee = Collections.max(emL);
        System.out.println(bestEmployee.getName() + " because he(she) has made " + bestEmployee.makeMoney + "$ but has only " + bestEmployee.accountMoney + "$ in his(her) bank account (maybe he(she) likes drugs)");
    }
}