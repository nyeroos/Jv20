package com.nyeroos.firstlesson.JV20.pr15;

import java.util.*;

public class User {
    private int id;
    private String name;
    int age;

    public static Map<Integer, User> allUsers;
    private static int countId = 0;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age &&
                Objects.equals(name, user.name); //&&
        //Objects.equals(sex, user.sex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public User(String name, int age) {
        if (allUsers == null) allUsers = new HashMap<>();
        this.name = name;
        this.age = age;
        if (!hasUser()) {
            countId++;
            this.id = countId;
            allUsers.put(id, this);
        }
    }

    private boolean hasUser() {
        for (User user : allUsers.values()) {
            if (user.equals(this) && user.hashCode() == this.hashCode())
                return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //лист всех пользователей
    public static List<User> getAllUsers() {
        return new ArrayList<>(allUsers.values());
    }

    //подсчет всех пользователей
    public static int getUsersCount() {
        return allUsers.size();
    }

    //общий возраст всех пользователей
    public static int getAges() {
        int countAge = 0;
        for (User user : allUsers.values()) {
            countAge += user.age;
        }
        return countAge;
    }

    //средний возраст всех пользователей
    public static int getAverageAge() {
        return getAges() / getUsersCount();
    }
}
