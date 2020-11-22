package com.nyeroos.firstlesson.JV20.pr21.ex2;

public class ChairFactory implements AbstractFactory{

    @Override
    public FunChair createFunctionalChair() {
        return new FunChair();
    }
}
