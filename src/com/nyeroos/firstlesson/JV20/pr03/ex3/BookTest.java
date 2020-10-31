package com.nyeroos.firstlesson.JV20.pr03.ex3;

public class BookTest {

    public static void main(String[] args) {
        Book book = new Book("J.London "," White Fang  ",1946);
        System.out.println(book.getAuthor() + book.getName() + book.getYear());
    }
}
