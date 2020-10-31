package com.nyeroos.firstlesson.JV20.pr15;

public class Main {
    public static void main(String[] args) {
        new User("Max", 25);
        new User("Mary", 20);
        new User("Alice", 7);
        new User("George", 16);


        System.out.println("Все пользователи:");
        User.getAllUsers().forEach(System.out::println);
        System.out.println("       всех пользователей: " + User.getUsersCount());
        System.out.println("       общий возраст всех пользователей: " + User.getAges());
        System.out.println("       средний возраст всех пользователей: " + User.getAverageAge());
    }
}
