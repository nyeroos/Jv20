package com.nyeroos.firstlesson.JV20.pr10;

public class ex10 {
    public static void main(String[] args) {
        System.out.println(func(158, 0));
    }

    public static int func(int n, int i) {
        if (n == 0) {
            return i;
        } else {
            return func(n / 10, i * 10 + n % 10);
        }
    }
}
