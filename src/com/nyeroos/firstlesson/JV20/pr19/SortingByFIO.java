package com.nyeroos.firstlesson.JV20.pr19;

import java.util.Comparator;

public class SortingByFIO implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getFio().compareTo(o2.getFio());
    }
}
