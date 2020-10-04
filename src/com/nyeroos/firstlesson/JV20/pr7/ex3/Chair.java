package com.nyeroos.firstlesson.JV20.pr7.ex3;

public class Chair extends Furniture {
    protected int price;
    protected String material;

    public Chair(int price, String material) {
        this.price = price;
        this.material = material;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
