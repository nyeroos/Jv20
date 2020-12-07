package com.nyeroos.firstlesson.JV20.pr28;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    private static Map<Integer, Integer> priceOnProducts = new HashMap<>();
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Order order = new Order();
    private static PayStrategy strategy;

    static {
        priceOnProducts.put(1, 75);
        priceOnProducts.put(2, 80);
        priceOnProducts.put(3, 60);
        priceOnProducts.put(4, 50);
    }

    public static void main(String[] args) throws IOException {
        while (!order.isClosed()) {
            int cost;

            String continueChoice;
            do {
                System.out.print("Please, choose a product:" + "\n" +
                        "1 - Milk" + "\n" +
                        "2 - Juice" + "\n" +
                        "3 - Cookie" + "\n" +
                        "4 - Cheese" + "\n");
                int choice = Integer.parseInt(reader.readLine());
                cost = priceOnProducts.get(choice);
                System.out.print("Amount: ");
                int count = Integer.parseInt(reader.readLine());
                order.setTotalCost(cost * count);
                System.out.print("Would you like to continue shopping? Y/N: ");
                continueChoice = reader.readLine();
            } while (continueChoice.equalsIgnoreCase("Y"));

            if (strategy == null) {
                System.out.println("Please, select a payment method:" + "\n" +
                        "1 - PalPay" + "\n" +
                        "2 - Credit Card");
                String paymentMethod = reader.readLine();

                if (paymentMethod.equals("1")) {
                    strategy = new ByPP();
                } else {
                    strategy = new ByCC();
                }
            }
            order.processOrder(strategy);

            System.out.print("Pay " + order.getTotalCost() + " or continue shopping? P/C: ");
            String proceed = reader.readLine();
            if (proceed.equalsIgnoreCase("О")) {
                if (strategy.pay(order.getTotalCost())) {
                    System.out.println("Payment was successful.");
                } else {
                    System.out.println("Error! Check your data.");
                }
                order.setClosed();
            }
        }
    }
}
