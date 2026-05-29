package InventoryManagementSystem;

import java.util.PriorityQueue;

public class OrderQueue {
    private PriorityQueue<Order> orderQueue;

    public OrderQueue(){
        orderQueue = new PriorityQueue<>();
    }

    public void addOrder(Order order){
        orderQueue.add(order);
    }

    public void processOrder(){
        Order order = orderQueue.poll();
        System.out.println(order + "Order has been processed");
    }


    public int getSize(){
        return orderQueue.size();
    }
}
