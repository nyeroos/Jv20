package com.nyeroos.firstlesson.JV20.pr30_32;

public interface Order {
    boolean add(MenuItem item);
    String[] itemsNames();
    int itemsQuantity();
    int itemQuantity(String itemName);
    int itemQuantity(MenuItem itemName);
    MenuItem[] getItems();
    boolean remove(String itemName);
    boolean remove(MenuItem item);
    int removeAll(String itemName);
    int removeAll(MenuItem item);
    MenuItem[] sortedItemByCostDesc();
    int costTotal();
    Customer getCustomer();
    void setCustomer(Customer customer);
}
