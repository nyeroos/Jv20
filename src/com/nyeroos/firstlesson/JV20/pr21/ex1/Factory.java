package com.nyeroos.firstlesson.JV20.pr21.ex1;

public class Factory implements ComnumAbstractFactory{
    @Override
    public Comnum createComplex() {
        return new Comnum();
    }

    @Override
    public Comnum createComplex(int real, int image) {
        return new Comnum(real,image);
    }
}
