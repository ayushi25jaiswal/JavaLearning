package ProducerConsumer.ProducerConsumerIssue;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    static void main(String[] args) {

        Store store = new Store();

        ExecutorService executor = Executors.newCachedThreadPool();

        for(int i=0; i<10; i++){
            executor.execute(new Producer(store));
        }

        for(int i=0; i<10; i++){
            executor.execute(new Consumer(store));
        }
    }
}
