package com.nyeroos.firstlesson.JV20.pr10;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        rec(n, 2);
    }

    static int rec(int n, int k) {
        int a;
        a = rec1(k, 2);
        if (a == 0) return 0;
        if ((n % a == 0) || (n == 1)) {
            System.out.print(a + " ");
            n = n / a;
            if (n == 1) return 0;
            rec(n, 2);
        } else {
            rec(n, a + 1);
        }
        return 0;
    }

    static int rec1(int n, int k) {
        if ((n == 2) || (n % k != 0) && (k >= Math.sqrt(n))) return n;
        else if (k < Math.sqrt(n)) rec1(n, k + 1);
        else rec1(n + 1, 2);
        return n;
    }
}
