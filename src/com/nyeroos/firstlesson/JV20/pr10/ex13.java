package com.nyeroos.firstlesson.JV20.pr10;

public class ex13 {
    public static void main(String[] args) {
        recursion();
    }

    public static void recursion() {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        if (n > 0) {
            int m = in.nextInt();
            System.out.println(n);
            if (m > 0) {
                recursion();
            }
        }
    }
}
