package org.buttercat.java.lesson002;

public class TinyCalc {
    public static int Add(int a, int b) {
        return a+b;
    }
    public static long Add(long a, long b) {
        return a+b;
    }
    public static double Add(double a, double b) {
        return a+b;
    }

    public static int Sub(int a, int b) {
        return a-b;
    }
    public static long Sub(long a, long b) {
        return a-b;
    }
    public static double Sub(double a, double b) {
        return a-b;
    }

    public static int Mul(int a, int b) {
        return a*b;
    }
    public static long Mul(long a, long b) {
        return a*b;
    }
    public static double Mul(double a, double b) {
        return a*b;
    }

    public static int Div(int a, int b) throws IllegalArgumentException {
        if(b == 0) {
            throw new IllegalArgumentException("Second argument is 0");
        }
        else {
            return a/b;
        }
    }
    public static long Div(long a, long b) throws IllegalArgumentException {
        if(b == 0) {
            throw new IllegalArgumentException("Second argument is 0");
        }
        else {
            return a/b;
        }
    }
    public static double Div(double a, double b) throws IllegalArgumentException {
        if(b == 0) {
            throw new IllegalArgumentException("Second argument is 0");
        }
        else {
            return a/b;
        }
    }
}