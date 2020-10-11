package com.nyeroos.firstlesson.JV20.pr10;

public class ex14 {
    public static void main(String[] args) {
        System.out.println(recursion(253));
    }

    public static String recursion(int n) {
        if (n < 10) {
            return Integer.toString(n);
        } else {
            return recursion(n / 10) + " " + n % 10;
        }
    }
}
