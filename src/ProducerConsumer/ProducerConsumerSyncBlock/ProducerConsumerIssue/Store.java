package ProducerConsumer.ProducerConsumerSyncBlock.ProducerConsumerIssue;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Object> items = new ArrayList<>();
    private int MAX_SIZE = 5;

    public void add(Object item){
        System.out.println("The item is produced: " + items.size());
        items.add(item);
    }

    public void remove(){
        System.out.println("The item is consumed: "+ items.size());
        items.remove(items.size()-1);
    }

    public int getMAX_Size(){
        return MAX_SIZE;
    }

    public List<Object> getItem(){
        return items;
    }
}
