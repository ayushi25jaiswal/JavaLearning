package InventoryManagementSystem;

import java.util.Comparator;

//desc order sorting on basics of price.
public class ItemPriceComparator implements Comparator<Item> {

    @Override
    public int compare(Item o1, Item o2) {
        //o1 first -> -1
        //o2 first -> 1
        //equal -> 0

        if (o1.getPrice() > o2.getPrice()){ return 1;}
        else if (o1.getPrice() < o2.getPrice()){ return -1;}

        else {
            return 0;
        }
    }
}
