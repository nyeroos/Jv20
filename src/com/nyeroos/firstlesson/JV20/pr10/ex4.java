package com.nyeroos.firstlesson.JV20.pr10;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int s = scan.nextInt();
        int b = 1;
        for (int i = 1; i < k; i++) {
            b *= 10;
        }
        int c = 0;
        int a = 0;
        for (int i = b; i <= (b * 10 - 1); i++) {
            int m = i;
            for (int j = 0; j < k; j++) {
                if (m != 0) {
                    c += m % 10;
                    m /= 10;
                }
            }
            if (c == s) {
                a++;
            }
            c = 0;
        }
        System.out.print(a);
    }
}
