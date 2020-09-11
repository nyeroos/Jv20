package com.nyeroos.firstlesson.JV20.pr1;

public class ex7 {
    public static void main(String[] args) {
        myFun(3);
    }

    public static void myFun(int a) {
        int fuck = 1;
        for (int i = 1; i < a + 1; i++) {
            fuck = fuck * i;
        }
        System.out.println(fuck);
    }
}
