package ProducerConsumer.Semaphore;

import java.util.concurrent.Semaphore;

public class Producer implements Runnable{

    private Store store;
    Semaphore proSema, conSema;

    public Producer(Store store, Semaphore proSema, Semaphore conSema){
        this.store = store;
        this.proSema = proSema;
        this.conSema = conSema;
    }

    @Override
    public void run() {
        while(true){
            try {
                proSema.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            store.add(new Object());

            conSema.release();

        }
    }
}
