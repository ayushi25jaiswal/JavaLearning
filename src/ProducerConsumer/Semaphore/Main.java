package ProducerConsumer.Semaphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Main {
    static void main(String[] args) {

        Store store = new Store();
        Semaphore proSema = new Semaphore(5);
        Semaphore conSema = new Semaphore(0);

        ExecutorService executor = Executors.newCachedThreadPool();

        for(int i=0; i<10; i++){
            executor.execute(new Producer(store, proSema, conSema));
        }

        for(int i=0; i<10; i++){
            executor.execute(new Consumer(store, proSema, conSema));
        }
    }
}
