package com.nyeroos.firstlesson.JV20.pr10;

public class ex15 {
    public static void main(String[] args) {
        System.out.println(recursion(321));
    }

    public static int recursion(int n) {
        if (n < 10) {
            return n;
        } else {
            System.out.print(n % 10 + " ");
            return recursion(n / 10);
        }
    }
}
