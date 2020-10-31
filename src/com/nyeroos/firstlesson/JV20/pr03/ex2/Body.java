package com.nyeroos.firstlesson.JV20.pr03.ex2;

public class Body {
    private String shape;
    private int height;

    public Body(String shape, int height) {
        this.shape = shape;
        this.height = height;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Body{" +
                "shape='" + shape + '\'' +
                ", height=" + height +
                '}';
    }
}
