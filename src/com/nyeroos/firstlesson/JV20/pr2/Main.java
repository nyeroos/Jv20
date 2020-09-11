package com.nyeroos.firstlesson.JV20.pr2;

public class Main {
    public static void main(String[] args) {
        Dog fdog = new Dog ("Lucky", 1);
        Dog sdog = new Dog("Will", 5);
        Petriot pet = new Petriot();
        pet.add(fdog, sdog);
    }
}

