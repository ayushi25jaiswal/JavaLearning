package InventoryManagementSystem;

import java.util.List;

public class Item implements Comparable<Item> {
    private int id;
    private String name;
    private double price;
    private int quantity;

    public Item(int id, String name, double price, int quantity) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public int compareTo(Item other) {
        return this.name.compareTo(other.name);
    }

    public String toString(){
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public static void printItems(List<Item> pairs) {
        for (int i = 0; i < pairs.size(); i++) {
            System.out.println(pairs.get(i));
        }
    }
}
