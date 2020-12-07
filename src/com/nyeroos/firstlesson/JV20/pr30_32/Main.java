package com.nyeroos.firstlesson.JV20.pr30_32;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter price, name and description");
        Scanner in = new Scanner(System.in);
        int quantity = in.nextInt();
        String name = in.next();
        String description = in.next();
        MenuItem menuItem = new MenuItem(quantity, name, description);
        try (FileWriter fileWriter = new FileWriter("java32.txt", false)) {
            fileWriter.write(menuItem.toString());
        } catch (IOException e) {
            e.getMessage();
        }
        try (FileReader fileReader = new FileReader("java32.txt")) {
            System.out.println("In file");
            Scanner scan = new Scanner(fileReader);
            while (scan.hasNextLine()) {
                System.out.println(scan.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.getMessage();
        } catch (IOException e) {
            e.getMessage();
        }
    }
}
