package com.nyeroos.firstlesson.JV20.pr4.ex1;

public class Square extends Rectangle{
    protected double side;

    public Square(){
    }

    public Square(double side){
        super(side, side);
    }


    public Square(double side, String color, boolean filled) {
        super(color, filled, side, side);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setWidth(double side){

    }

    public void setLength(double side){

    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
