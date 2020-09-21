package com.nyeroos.firstlesson.JV20.pr6;

public class Main {

    public static void main(String[] args) {
//        MovableRectangle a=new MovableRectangle(0,0,10,10,3,3);
//        System.out.println(a);
//        a.moveDown();
//        a.moveDown();
//        System.out.println(a);

        MovableRectangle rectangle = new MovableRectangle(0, 5, 7, 0, 3, 3);
        System.out.println(rectangle);
        rectangle.check();
        rectangle.moveDown();
        System.out.println(rectangle);
        rectangle.moveLeft();
        System.out.println(rectangle);
        rectangle.moveRight();
        System.out.println(rectangle);
        rectangle.moveUp();
        System.out.println(rectangle);
        MovableRectangle rectangle2 = new MovableRectangle(0, 5, 7, 0, 3, 5);
        System.out.println(rectangle2.check());
        rectangle2.moveDown();
        System.out.println(rectangle2);
        rectangle2.moveLeft();
        System.out.println(rectangle2);
        rectangle2.moveRight();
        System.out.println(rectangle2);
        rectangle2.moveUp();
        System.out.println(rectangle2);

    }
}
