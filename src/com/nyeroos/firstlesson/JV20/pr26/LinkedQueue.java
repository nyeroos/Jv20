package com.nyeroos.firstlesson.JV20.pr26;

public class LinkedQueue {
    private Elements head;
    private Elements tail;
    private int elements;
    private int size;

    LinkedQueue(int quantity) {
        elements = 0;
        size = quantity;
    }

    void add(int element) {
        if (elements + 1 != size) {
            Elements a = new Elements();
            a.element = element;
            if (head == null) {
                elements++;
                head = a;
                head.next = tail;
                tail = a;
            } else {
                elements++;
                tail.next = a;
                tail = tail.next;
            }
        }
    }

    public boolean isFull() {
        if (elements != size) return false;
        else return true;
    }

    public boolean isEmpty() {
        if (elements == 0) return true;
        else return false;
    }

    void del() {
        if (head == null) return;
        poll();
    }

    public int poll() {
        elements--;
        Elements tmp = head;
        head = head.next;
        return tmp.element;
    }

    @Override
    public String toString() {
        return "Queue_list{" +
                "head=" + head +
                ", tail=" + tail +
                ", elements=" + elements +
                ", size=" + size +
                '}';
    }
}
