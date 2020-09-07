package com.nyeroos.firstlesson;

import java.util.Random;

public class ex6 {
    public static void main(String[] args){
        int[] array = new int[3];
        for (int i=0; i<array.length; i++){
            array[i]=(int) (Math.random()*100);
            System.out.print(array[i]+ " ");
        }

        bubbleSort(array);
        System.out.println("\n");
        for (int i=0; i<array.length; i++){

            System.out.print(array[i]+" ");
        }
        System.out.println("\n");

        //var2
        Random random = new Random(123);
        for(int i=0; i<array.length; i++){
            array[i]=random.nextInt(100);
            System.out.print(array[i]+ " ");
        }
        bubbleSort(array);
        System.out.println("\n");
        for (int i=0; i<array.length; i++){

            System.out.print(array[i]+" ");
        }

    }





    public static void bubbleSort(int[] arr){
        for(int i = arr.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
            if( arr[j] > arr[j+1] ){
                int tmp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = tmp;
            }
        }
    }
}

}
