package com.nyeroos.firstlesson.JV20.pr7.ex1;

public class Plate extends Dish{
    protected int depth;
    protected String colour;

    public Plate(int depth, String colour) {
        this.depth = depth;
        this.colour = colour;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
