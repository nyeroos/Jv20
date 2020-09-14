package com.nyeroos.firstlesson.JV20.pr3.ex2;

public class Head {
    private int brain;
    private String hearColor;

    public Head(int brain, String hearColor) {
        this.brain = brain;
        this.hearColor = hearColor;
    }

    public int getBrain() {
        return brain;
    }

    public void setBrain(int brain) {
        this.brain = brain;
    }

    public String getHearColor() {
        return hearColor;
    }

    public void setHearColor(String hearColor) {
        this.hearColor = hearColor;
    }

    @Override
    public String toString() {
        return "Head{" +
                "brain=" + brain +
                ", hearColor='" + hearColor + '\'' +
                '}';
    }
}
