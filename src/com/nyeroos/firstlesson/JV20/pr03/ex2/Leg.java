package com.nyeroos.firstlesson.JV20.pr03.ex2;

public class Leg {
    private boolean strength;
    private int length;

    public Leg(boolean strength, int length) {
        this.strength = strength;
        this.length = length;
    }

    public boolean isStrength() {
        return strength;
    }

    public void setStrength(boolean strength) {
        this.strength = strength;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Leg{" +
                "strength=" + strength +
                ", length=" + length +
                '}';
    }
}
