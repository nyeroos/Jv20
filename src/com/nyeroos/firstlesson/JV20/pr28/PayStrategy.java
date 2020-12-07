package com.nyeroos.firstlesson.JV20.pr28;

public interface PayStrategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}
