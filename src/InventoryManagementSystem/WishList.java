package InventoryManagementSystem;

import java.util.HashSet;
import java.util.Set;

public class WishList {
    private Set<Item> wishlist;

    public WishList(){
        wishlist = new HashSet<>();
    }

    public void addToWishList(Item item){
        wishlist.add(item);
    }

    public void removeFromWishList(Item item){
        wishlist.remove(item);
    }

    public Set<Item> getWishList(){
        return wishlist;
    }
}
