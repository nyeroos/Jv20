package com.nyeroos.firstlesson.JV20.pr07.ex2;

public class Beagle extends Dog{
    protected String name;
    protected int range;

    public Beagle(String name, int range) {
        this.name = name;
        this.range = range;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }
}
