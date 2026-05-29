package InventoryManagementSystem;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static InventoryManagementSystem.Item.printItems;

public class Main {
    static void main(String[] args) {

        List<Item> items = new ArrayList<>();
        items.add(new Book(1,"Harry Potter", 200, 1,"JK" ));
        items.add(new Book(2, "Game of Thrones", 200, 1,"JK"));
        items.add(new Book(3, "Bhagvatgita", 200, 1,"JK"));
        items.add(new Clothing(4, "Top", 200, 1,"XL"));
        items.add(new Electronics(5, "Bulb", 200, 1,2));
        items.add(new Electronics(6,"screw", 200, 1,0));

        Collections.sort(items);
        System.out.println(items);

        printItems(items);

        System.out.println("******************************");
        System.out.println("Electronics Inventory");
        Inventory<Electronics> electronicsInventory = new Inventory<>();
        electronicsInventory.add(new Electronics(1, "Laptop",50 ,  8 , 24));
        electronicsInventory.add(new Electronics(2, "Laptop",15 ,  9 , 24));
        electronicsInventory.add(new Electronics(3, "Mobile",500, 4, 24));

        System.out.println("Items List from the Inventory : ");
        for (Item item : electronicsInventory.getAllItems()) {
            System.out.println(item.getName() + ": " + item.getPrice());
        }
    }
}
