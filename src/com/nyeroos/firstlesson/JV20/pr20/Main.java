package com.nyeroos.firstlesson.JV20.pr20;

public class Main {
    public static void main(String[] args) {
        String[] g = {"java", "lesson", "17"};
        Integer[] b = {-10, -5, -7};
        Solution f = new Solution();
        f.addArray(g);
        f.addArray(b);
        f.add(3.0);
        f.getList();
        System.out.println(f);
        System.out.println(f.get(3));
        System.out.println(f.get(10));
    }
}
