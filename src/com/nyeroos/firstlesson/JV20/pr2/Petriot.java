package com.nyeroos.firstlesson.JV20.pr2;

public class Petriot {
        private Dog[] dogs = new Dog[10];
        private int SIZE = 0;

        public void add(Dog...newDogs){
            for (int i=0; i<newDogs.length; i++){
                dogs[SIZE] = newDogs[i];
                SIZE++;
            }

//            for (int j=0; j<newDogs.length; j++) {
//                System.out.println(newDogs[j]);
//            }
        }


}
