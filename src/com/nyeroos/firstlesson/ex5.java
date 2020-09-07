package com.nyeroos.firstlesson;

public class ex5 {

    public static void main(String[] args){
        for (int i=1; i<11; i++){
            double var = 1.0/i;
            String mess = String.format("%.2f", var);
            System.out.println(mess);
        }
    }
}

