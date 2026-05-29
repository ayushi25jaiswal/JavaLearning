package InventoryManagementSystem;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RecentlyViewedItem  {
    private LinkedList<Item> items ;

    public RecentlyViewedItem(){
        items = new LinkedList<>();
    }

    public void add(Item item){
        items.remove(item);//removing it so if it present in list already, remove redundancy.
        // only remove when its present
        items.add(item);

        if(items.size()>10){
            items.remove();
        }
    }

    public List<Item> getRecentlyViewedItems(){
        return items;
    }
}

//check between LinkedList and LinkedHashMap (optimization)
