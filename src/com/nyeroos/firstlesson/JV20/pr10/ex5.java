package com.nyeroos.firstlesson.JV20.pr10;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        rec(n, 0);
    }

    static void rec(int n, int k) {
        if (n != 0) {
            k += n % 10;
            rec(n / 10, k);
        } else {
            System.out.print(k);
        }
    }
}
