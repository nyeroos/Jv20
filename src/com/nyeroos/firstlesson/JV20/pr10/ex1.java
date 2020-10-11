package com.nyeroos.firstlesson.JV20.pr10;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        for (int j = 1; j <= k; j++) {
            rec(j, j);
        }
    }

    static int rec(int n, int k) {
        if (k > 0) {
            System.out.print(n + " ");
            rec(n, k - 1);
        }
        return 0;
    }
}
