package org.buttercat.java.lesson006;

public class ChildClass extends ParentClass {

    public ChildClass(int _i) {
        super(_i);
    }

    public void getInt() {
        System.out.println("Super number is " + super.i);
    }

}