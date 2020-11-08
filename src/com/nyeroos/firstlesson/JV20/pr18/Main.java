package com.nyeroos.firstlesson.JV20.pr18;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(2.0 / 0);
        // System.out.println(2/0); exceptionDemo
        System.out.println(Double.POSITIVE_INFINITY);
    }


    public static void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer ");
        String intString = myScanner.next();
        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (ArithmeticException e) {
            System.out.println(e.getClass() + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println(e.getClass() + e.getMessage());
        }
    }
}
