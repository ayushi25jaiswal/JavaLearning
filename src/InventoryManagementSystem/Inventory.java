package InventoryManagementSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Inventory <T extends Item>{
    HashMap<Integer, T> items;

    public Inventory(){
        items = new HashMap<>();
    }

    public void add (T item){
        items.put(item.getId(), item);
    }

    public void remove(int id){
        items.remove(id);

    }

    public void get(String id){
        System.out.println(items.get(id));

    }

    public List<T> getAllItems(){
        return new ArrayList<>(items.values());
    }


}
