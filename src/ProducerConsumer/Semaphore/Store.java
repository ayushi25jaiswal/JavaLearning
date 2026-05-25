package ProducerConsumer.Semaphore;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;

public class Store {
    private ConcurrentLinkedDeque<Object> items = new ConcurrentLinkedDeque();
    private int MAX_SIZE = 5;

    public void add(Object item){
        System.out.println("The item is produced: " + items.size());
        items.add(item);
    }

    public void remove(){
        System.out.println("The item is consumed: "+ items.size());
        items.remove();
    }

    public int getMAX_Size(){
        return MAX_SIZE;
    }

    public ConcurrentLinkedDeque<Object> getItem(){
        return items;
    }
}
