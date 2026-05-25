package ProducerConsumer.ProducerConsumerIssue;

public class Consumer implements Runnable{

    private Store store;

    public Consumer(Store store){
        this.store = store;
    }

    @Override
    public void run() {
        while(true){
            if(store.getItem().size()>0){
                store.remove();
            }
        }
    }
}
