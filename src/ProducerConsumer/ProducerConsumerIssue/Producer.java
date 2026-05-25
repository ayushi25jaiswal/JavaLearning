package ProducerConsumer.ProducerConsumerIssue;

public class Producer implements Runnable{

    private Store store;

    public Producer(Store store){
        this.store = store;
    }

    @Override
    public void run() {
        while(true){
            if(store.getItem().size() < store.getMAX_Size()){
                store.add(new Object());
            }
        }
    }
}
