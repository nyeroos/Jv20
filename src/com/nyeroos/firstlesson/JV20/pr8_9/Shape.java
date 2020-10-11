package com.nyeroos.firstlesson.JV20.pr8_9;

import java.awt.*;

public abstract class Shape {
    protected String color;
    protected int x;
    protected int y;


    public Shape(){}

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                '}';
    }

    public void generatePosition(int a, int b) {
        x = a;
        y = b;
    }

    public abstract void draw(Graphics2D g);
}
