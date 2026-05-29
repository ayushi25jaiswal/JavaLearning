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

        System.out.println("****************************");

        Item item2 = new Electronics(1, "Mobile", 5 , 999, 24);
        Item item3 = new Electronics(2, "Watch", 5 , 999, 24);
        Item item4 = new Electronics(3, "Ipad", 5 , 999, 24);
        Item item5 = new Electronics(4, "Speaker", 5 , 999, 24);
        Item item6 = new Book(5, "Java Programming", 50, 59, "John Doe");
        Item item7 = new Book(6, "Java Programming 2", 50, 59, "John Doe");
        Item item8 = new Book(7, "Java Programming 2", 50, 59, "John Doe");
        Item item9 = new Book(8, "Java Programming 2", 50, 59, "John Doe");
        Item item10 = new Book(9, "Java Programming 2", 50, 59, "John Doe");
        Item item11 = new Book(10, "Java Programming 2", 50, 59, "John Doe");
        Item item12 = new Book(11, "Java Programming 2", 50, 59, "John Doe");
        RecentlyViewedItem recentlyViewedItems = new RecentlyViewedItem();

        recentlyViewedItems.add(item3);
        recentlyViewedItems.add(item2);
        recentlyViewedItems.add(item5);
        recentlyViewedItems.add(item2);
        recentlyViewedItems.add(item5);
        recentlyViewedItems.add(item4);
        recentlyViewedItems.add(item6);
        recentlyViewedItems.add(item8);
        recentlyViewedItems.add(item9);
        recentlyViewedItems.add(item10);
        recentlyViewedItems.add(item11);
        recentlyViewedItems.add(item12);




        System.out.println("RecentlyViewedItems List : ");
        List<Item> recentlyViewedItemsList = recentlyViewedItems.getRecentlyViewedItems();
        for (Item item : recentlyViewedItemsList) {
            System.out.println(item.getId());
        }


    }
}
