package com.nyeroos.firstlesson.JV20.pr26;

import java.util.Random;

public class ArrayQueueADT {
    private int[] queue_mass;
    private int elements = 0;
    private int begin;
    private int end;


    public static void ArrayQueueADTConstructor(ArrayQueueADT q, int quantity) {
        q.queue_mass = new int[quantity];
        q.begin = -1;
        q.end = -1;
    }

    public void generate(ArrayQueueADT q) {
        Random rand = new Random();
        while (!isFull(q)) q.add(q, Math.abs(rand.nextInt()) % 1000);
    }

    public void add(ArrayQueueADT q, int element) {
        if (!isFull(q)) {
            q.end = (q.end + 1) % q.queue_mass.length;
            q.queue_mass[q.end % q.queue_mass.length] = element;
        } else System.out.println("Queue is full");
    }

    public int poll(ArrayQueueADT q) {
        q.elements--;
        q.begin = (q.begin + 1) % q.queue_mass.length;
        return q.queue_mass[begin];
    }

    public void del(ArrayQueueADT q) {
        q.elements--;
        q.begin = (q.begin + 1) % q.queue_mass.length;
    }

    public boolean isFull(ArrayQueueADT q) {
        if (q.elements != q.queue_mass.length) return false;
        else return true;
    }

    public boolean isEmpty(ArrayQueueADT q) {
        if (q.elements == 0) return true;
        else return false;
    }

    public boolean deleteQueue(ArrayQueueADT q) {
        q.queue_mass = new int[q.queue_mass.length];
        q.begin = -1;
        q.end = -1;
        return true;
    }

    public int quantityElements(ArrayQueueADT q) {
        return q.elements;
    }

}
