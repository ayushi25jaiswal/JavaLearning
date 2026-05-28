package InventoryManagementSystem;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    static void main(String[] args) {

        List<Item> items = new ArrayList<>();
        items.add(new Book("Harry Potter"));
        items.add(new Book("Game of Thrones"));
        items.add(new Book("Bhagvatgita"));
        items.add(new Clothing("Top"));
        items.add(new Electronics("Bulb"));
        items.add(new Electronics("screw"));

        Collections.sort(items);
        System.out.println(items);
    }
}
