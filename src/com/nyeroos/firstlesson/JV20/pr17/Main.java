package com.nyeroos.firstlesson.JV20.pr17;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file1 = new File("C:\\Users\\Xiaomi\\Desktop\\text.txt");
        String t = new Scanner(System.in).nextLine();

        try {
            FileWriter writer = new FileWriter(file1);
            writer.write(t);
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(new Scanner(new File("C:\\Users\\Xiaomi\\Desktop\\text.txt")).nextLine());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        t = new Scanner(System.in).nextLine();
        try {
            FileWriter writer = new FileWriter(file1);
            writer.write(t);
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(new Scanner(new File("C:\\Users\\Xiaomi\\Desktop\\text.txt")).nextLine());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        try {
            FileWriter writer = new FileWriter(file1, true);
            writer.append(t);
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(new Scanner(new File("C:\\Users\\Xiaomi\\Desktop\\text.txt")).nextLine());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
