package InventoryManagementSystem;

public class Item implements Comparable<Item> {
    private int id;
    private String name;
    private double price;
    private int quantity;

    public Item(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Item other) {
        return this.name.compareTo(other.name);
    }

    public String toString(){
        return name;
    }
}
