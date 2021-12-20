package org.buttercat.java.lesson006;

public class Lorry extends Car {
    public int wheelCnt;
    public int maxWeight;

    public void newWheels(int wh) {
        wheelCnt = wh;
        System.out.println((wh > 1) ? ("There are " + wh + " wheels") : ("There is " + wh + "wheel") );
    }

    public Lorry(int w, String m, char c, float s, int wh, int mw) {
        super(w, m, c, s);
        wheelCnt = wh;
        maxWeight = mw;
    }

    @Override
    public void outPut() {
        super.outPut();
        System.out.println("Количество колес - " + wheelCnt + " и максимальный вес - " + maxWeight);
    }
}