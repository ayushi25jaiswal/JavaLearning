package InventoryManagementSystem;

import java.util.PriorityQueue;

public class Order implements Comparable<Order> {
    private int orderId;
    private boolean isExpress;

    public Order( boolean isExpress, int orderId){
        this.orderId = orderId;
        this.isExpress = isExpress;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public boolean isExpress() {
        return isExpress;
    }

    public void setExpress(boolean express) {
        isExpress = express;
    }
    @Override
    public String toString() {
        return "Order{id=" + orderId +
                ", express=" + isExpress + "} ";
    }



    @Override
    public int compareTo(Order o) {
        if(this.isExpress && !o.isExpress)
            return -1;

        if(!this.isExpress && o.isExpress)
            return 1;

        return Integer.compare(this.orderId,
                o.orderId);
    }
}
