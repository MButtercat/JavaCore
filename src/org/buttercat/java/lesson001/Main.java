package org.buttercat.java.lesson001;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            Lesson1 L = new Lesson1();
            L.Task1();
            L.Task2();
            L.Task3();
            L.Task4();
            L.Task5();
            L.Task6();
        } catch (Exception e) {
            System.out.println("Звуки грустного трамбона");
        }
    }
}

class Lesson1 {
    void Task1() {
        String Str = "Я хорошо знаю Java";
        for (String Res : Str.split(" ")) {
            System.out.println(Res);
        }
    }
    void Task2() {
        System.out.println((46 + 10) * (10 / 3));
        System.out.println((29) * (4) * (-15));
    }
    void Task3() {
        int NumInt = 10500;
        int ResInt = NumInt/10/10;
        double ResDbl = NumInt/10./10.;
        System.out.println("As int = " + ResInt + "; as double = " + ResDbl);
    }
    void Task4() {
        double Res = 3.6*4.1*5.9;
        System.out.println("3.6*4.1*5.9 = " + Res);
    }
    void Task5() throws Exception {
        InputStreamReader InputR = new InputStreamReader(System.in);
        BufferedReader Lines = new BufferedReader(InputR);
        String TmpLine = "";
        String ResLine = "";
        while ((TmpLine = Lines.readLine()) != null && !TmpLine.trim().isEmpty()) {
            ResLine += TmpLine + " ";
        }
        for (String Res : ResLine.split(" ")) {
            System.out.println(Res);
        }
    }
    void Task6() throws Exception {
        InputStreamReader InputR = new InputStreamReader(System.in);
        BufferedReader Lines = new BufferedReader(InputR);
        int OurNum = Integer.parseInt(Lines.readLine());

        if(OurNum%2 == 0) {
            if(OurNum > 100) {
                System.out.println("Выход за пределы диапазона четных чисел");
            }
            else {
                System.out.println("Наше число четное! Ура! Гноби нечетников!");
            }
        }
        else {
            System.out.println("Наше число нечетное! Ура! Четники мастдай!");
        }

    }
}
