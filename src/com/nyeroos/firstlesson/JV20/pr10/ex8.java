package com.nyeroos.firstlesson.JV20.pr10;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String p = scan.nextLine();
        String a, b;
        if (p.length() % 2 == 0) {
            a = p.substring(0, p.length() / 2);
            b = p.substring(p.length() / 2, p.length());
            b = new StringBuffer(b).reverse().toString();
            if (a.equals(b)) {
                System.out.print("YES");
            } else {
                System.out.print("NO");
            }
        } else {
            a = p.substring(0, (p.length() - 1) / 2);
            b = p.substring((p.length() + 1) / 2, p.length());
            b = new StringBuffer(b).reverse().toString();
            if (a.equals(b)) {
                System.out.print("YES");
            } else {
                System.out.print("NO");
            }
        }
    }
}
