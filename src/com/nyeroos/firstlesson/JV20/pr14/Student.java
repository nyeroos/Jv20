package com.nyeroos.firstlesson.JV20.pr14;

public class Student implements Test {
    private static int value = 0;
    private int iDNumber;
    private double GPA;


    Student(double gpa) {
        value++;
        this.iDNumber = value;
        this.GPA = gpa;

    }

    public double getGPA() {
        return GPA;
    }

    public int getiD() {
        return iDNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return iDNumber == student.iDNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "iDNumber=" + iDNumber +
                ", GPA=" + GPA +
                '}';
    }
}
