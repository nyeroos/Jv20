package com.nyeroos.firstlesson.JV20.pr27.Calculator;

import java.util.Scanner;

public class Calculator {
    private Operation op;

    public Calculator(Operation op) {
        this.op = op;
        this.scan();
    }

    public void scan() {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        char action;
        while (true) {
            try {
                a = scanner.nextInt();
                b = scanner.nextInt();
                action = scanner.next().charAt(0);
                op.addResult(a, b, action);
                System.out.println(op.getResult());
            } catch (Exception ex) {
                System.out.println(ex);
                break;
            }
        }
    }
}
