package org.buttercat.java.lesson002;

// На самом деле неотъемлемая сущность больщей части сущего
public class Unusefulness {
    private String Name;
    private int EntropyPercent;

    public Unusefulness() {
        Name = "All";
        EntropyPercent = 100;
    }
    public Unusefulness(String s) {
        this.Name = s;
    }

    public Unusefulness(int i) {
        this.EntropyPercent = i;
    }

    public Unusefulness(String s, int i) {
        this(s);
        this.EntropyPercent = i;
    }
}
