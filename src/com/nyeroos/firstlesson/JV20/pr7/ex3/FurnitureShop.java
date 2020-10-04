package com.nyeroos.firstlesson.JV20.pr7.ex3;

public class FurnitureShop {

    public static void main(String[] args) {
        Chair chair = new Chair(3200, "tree");
        System.out.println("There is a chair");
        System.out.println(chair.getPrice());
        System.out.println(chair.getMaterial());
    }
}
