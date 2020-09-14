package com.nyeroos.firstlesson.JV20.pr3.ex2;

public class Human {


    public static void main(String[] args) {
        Head head = new Head(100,"red");
        Leg leg = new Leg(true,70);
        Body body = new Body("fat", 160);

        System.out.println(head.getHearColor() +" "+ leg.getLength() +" "+ body.getHeight());
    }
}
