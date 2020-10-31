package com.nyeroos.firstlesson.JV20.pr16;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    static ArrayList<Integer> cards1 = new ArrayList<>();
    static ArrayList<Integer> cards2 = new ArrayList<>();
    static int motion = 0;

    public static void start() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first gamer's cards:");
        String t = scan.nextLine();
        String[] spl = t.split(" ");
        for (int i = 0; i < spl.length; i++) {
            int a = Integer.parseInt(spl[i]);
            cards1.add(a);
        }

        System.out.println("Enter second gamer's cards:");
        t = scan.nextLine();
        spl = t.split(" ");
        for (int i = 0; i < spl.length; i++) {
            int a = Integer.parseInt(spl[i]);
            cards2.add(a);
        }

        while (cards1.size() != 0 && cards2.size() != 0) {
            if (motion == 106) {
                System.out.println("botva");
                end();
                return;
            }
            motion++;
            round();
        }
        end();
    }

    public static void round() {
        System.out.println("Round: " + motion);
        System.out.println("\t First gamer:" + cards1.get(0) + "\t Second gamer: " + cards2.get(0));
        if (compare(cards1.get(0), cards2.get(0))) {
            System.out.println("First gamer gets cards");
            cards1.add(cards1.get(0));//помещаем первую карту в конец
            cards1.remove(0);
            cards1.add(cards2.get(0)); //забираем карту проигравшего игрока
            cards2.remove(0);

        } else {
            System.out.println("Second gamer gets cards");
            cards2.add(cards2.get(0));//помещаем первую карту в конец
            cards2.remove(0);
            cards2.add(cards1.get(0));
            cards1.remove(0);
        }
        System.out.println("---------------------------");
    }

    public static boolean compare(int a, int b) {//True - первый игрок, иначе второй
        if (b == 0 && a == 9) return false;
        if ((a == 0 && b == 9) || a > b) return true; //младшая карта бьёт старшую
        return false;
    }

    public static void end() {
        if (cards1.size() == 0)
            System.out.println("\nWinner: second gamer!");
        if (cards2.size() == 0)
            System.out.println("\nWinner: first gamer!");
    }
}
