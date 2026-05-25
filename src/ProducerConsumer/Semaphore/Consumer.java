package ProducerConsumer.Semaphore;

import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{

    private Store store;
    private Semaphore proSema, conSema;

    public Consumer(Store store, Semaphore proSema, Semaphore conSema){
        this.store = store;
        this.proSema = proSema;
        this.conSema = conSema;
    }

    @Override
    public void run() {
        while(true){
            try {
                conSema.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            store.remove();

            proSema.release();

        }
    }
}
