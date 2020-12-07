package com.nyeroos.firstlesson.JV20.pr31;

public class Calculator {
    private int a, b;
    private char action;
    private double c;

    public Calculator(int a, int b, char action) {
        this.a = a;
        this.b = b;
        this.action = action;
        calculate();
    }

    public void calculate(){
        switch (action){
            case '+': c = b + a; break;
            case '-': c = a - b; break;
            case '*': c = a*b; break;
            case '/': c = a/b; break;
        }
        return;
    }

    public double getResult() {
        return c;
    }

    public void setResult(double c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "a=" + a +
                ", b=" + b +
                ", action=" + action +
                ", c=" + c +
                '}';
    }
}
