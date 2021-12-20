package org.buttercat.java.lesson006;

public abstract class AbstractHuman {
    public String firstName;
    public String lastName;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public AbstractHuman() {
        firstName = new String();
        lastName = new String();
    }

    public AbstractHuman(String n, String l) {
        this();
        firstName = n;
        lastName = l;
    }

    public abstract void getInfo();
}