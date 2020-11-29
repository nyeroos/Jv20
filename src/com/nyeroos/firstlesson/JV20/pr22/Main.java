package com.nyeroos.firstlesson.JV20.pr22;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Student student=new Student("Ivan", 5.0,"07.03.2001 07:34");
        System.out.println(student);
        System.out.println(student.getBirthday("shortDate"));
        Thread.sleep(2000);
        student.passWork();
    }
}
