package com.nyeroos.firstlesson.JV20.pr19;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String fio;
        String inn;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter FIO");
        fio = in.nextLine();
        System.out.println("Enter INN");
        inn = in.nextLine();
        boolean result = inn.matches("([0-9]+){10}");
        if (result) {
            if (inn.charAt(0) != '0') {
                System.out.println("INN is conformed");
            } else {
                System.out.println("ИНН is not conformed");
            }
        } else {
            System.out.println("ИНН is not conformed");
        }
    }
}
