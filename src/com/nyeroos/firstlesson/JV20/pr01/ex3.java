package com.nyeroos.firstlesson.JV20.pr01;

public class ex3 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("during for: " + sum);

        int j = 0;
        int sum1 = 0;
        while (j < array.length) {
            sum1 = sum1 + array[j];
            j++;

        }
        System.out.println("during while: " + sum1);

        int k = 0, sum2 = 0;
        do {
            sum2 = sum2 + array[k];
            k++;
        }
        while (k < array.length);
        System.out.println("during do while: " + sum2);
    }

}
