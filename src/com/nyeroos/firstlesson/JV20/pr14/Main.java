package com.nyeroos.firstlesson.JV20.pr14;

public class Main {
    public static void main(String[] args) {
        Test[] students = new Student[]{
                new Student(3.0),
                new Student(4.0),
                new Student(5.0),
                new Student(4.0),
                new Student(3.0),
        };

        System.out.println(iteratSearch(students, students[2]));
        System.out.println(iteratSearch(students, new Student(5.0)));


        Student[] students2 = new Student[]{
                new Student(5.0),
                new Student(4.0),
                new Student(3.0),
                new Student(2.0)
        };

        System.out.println();
        System.out.println(students2[1]);
        System.out.println(binarSearch(0, students2.length - 1, students2, students2[1]));
        System.out.println(binarSearch(0, students2.length, students2, new Student(30)));
        System.out.println(binarSearch(0, students2.length - 1, students2, new Student(10)));
    }

    public static Test iteratSearch(Test[] mass, Test t) {
        for (Test g : mass
        ) {
            if (g == t) return g;

        }

        return null;
    }

    public static Test binarSearch(int begin, int end, Test[] mass, Test t) {
        int mid = (begin + end) / 2;
        if (mass[mid] == t) return mass[mid];
        if (begin == mid || end == mass.length) return null;
        if (t.getiD() < mass[mid].getiD()) return binarSearch(begin, mid, mass, t);
        else {
            return binarSearch(mid, end, mass, t);
        }
    }
}
