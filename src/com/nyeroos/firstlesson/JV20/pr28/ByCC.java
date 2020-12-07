package com.nyeroos.firstlesson.JV20.pr28;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ByCC implements PayStrategy{
    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private CreditCard card;

    @Override
    public void collectPaymentDetails() {
        try {
            System.out.print("Enter card number: ");
            String number = READER.readLine();
            System.out.print("Enter expiry date: ");
            String date = READER.readLine();
            System.out.print("Enter CVV: ");
            String cvv = READER.readLine();
            card = new CreditCard(number, date, cvv);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public boolean pay(int paymentAmount) {
        if (cardIsPresent()) {
            System.out.println("Paid " + paymentAmount + " with Credit Card.");
            card.setAmount(card.getAmount() - paymentAmount);
            return true;
        } else {
            return false;
        }
    }

    private boolean cardIsPresent() {
        return card != null;
    }
}
