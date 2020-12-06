package com.nyeroos.firstlesson.JV20.pr26;

public class Elements {
    public Elements next;
    public int element;

    public Elements getNext() {
        return next;
    }

    public int getElement() {
        return element;
    }

    @Override
    public String toString() {
        return "ListElement{" +
                "next=" + next +
                ", element=" + element +
                '}';
    }
}
