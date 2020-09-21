package com.nyeroos.firstlesson.JV20.pr5;

public class Main {
    public static void main(String[] args) {
        MovableCircle circle = new MovableCircle(1,10,2,7,5);
        System.out.println(circle);
        circle.moveLeft();
        System.out.println(circle);
        circle.moveDown();
        System.out.println(circle);
        circle.moveRight();
        System.out.println(circle);
        circle.moveUp();
        System.out.println(circle);
    }
}
