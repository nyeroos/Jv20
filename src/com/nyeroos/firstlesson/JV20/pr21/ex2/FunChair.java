package com.nyeroos.firstlesson.JV20.pr21.ex2;


public class FunChair implements Chair {
    public int sum(int a, int b){
            return a+b;
        }

        @Override
        public void sit() {
            System.out.println("Сел на "+ this.getClass());
        }
}


