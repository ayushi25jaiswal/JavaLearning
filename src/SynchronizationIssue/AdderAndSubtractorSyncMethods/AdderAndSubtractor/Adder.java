package SynchronizationIssue.AdderAndSubtractorSyncMethods.AdderAndSubtractor;

import java.util.concurrent.Callable;

public class Adder implements Callable<Void> {

    private Value value;


    public Adder(Value value){
        this.value = value;

    }

    @Override
    public Void call() throws Exception {
        for(int i=0; i<1000; i++){
                value.increment(i);
        }
        return null;
    }
}
