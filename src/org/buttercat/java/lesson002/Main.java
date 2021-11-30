package org.buttercat.java.lesson002;

public class Main {
    public static void main(String[] args) {

// First part

        int NumTen = 10, NumDblTen = 20;
        long NumThousand = 1000, NumDblThousand = 2000;
        double NumE = 2.71, NumPI = 3.14;

        int ResInt;
        long ResLong;
        double ResDbl;

        System.out.print("Firstly a strange int formula:  ");
        ResInt = TinyCalc.Mul(TinyCalc.Sub(NumDblTen, NumTen),TinyCalc.Add(NumTen, NumDblTen));
        System.out.println(ResInt != 300 ? ResInt : ResInt + ", kek");

        ResDbl = TinyCalc.Add(NumE, NumPI);
        System.out.println("Btw do you know that sum of E and Pi is " + ResDbl);

        System.out.print("And finally some long operations: ");
        try {
            ResLong = TinyCalc.Div(NumThousand, TinyCalc.Sub(NumThousand, TinyCalc.Div(NumDblThousand, 2)));
            System.out.println("No way!!");
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage() + " (try to find it, hah-hah)");
        }

// Second part

        Unusefulness EveryThing = new Unusefulness();
        Unusefulness Michael = new Unusefulness("Michael", 100);
    }
}

