package com.nyeroos.firstlesson.JV20.pr08_09;

import java.awt.*;

public class Circle extends Shape {
    protected double radius;

    public Circle(){}

    public Circle(double radius, double x, double y) {
        super.generatePosition((int)x, (int)y);
        this.radius = radius;
    }

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius=radius;
    }
    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void draw(Graphics2D g) {
        g.drawRoundRect(x, y, (int)radius*2, (int)radius*2, 1000, 1000);
    }
}
