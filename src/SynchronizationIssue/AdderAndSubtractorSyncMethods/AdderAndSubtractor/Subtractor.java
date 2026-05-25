package SynchronizationIssue.AdderAndSubtractorSyncMethods.AdderAndSubtractor;

import java.util.concurrent.Callable;

public class Subtractor implements Callable <Void> {
    private Value value;


    public Subtractor (Value value){
        this.value = value;

    }


    @Override
    public Void call() throws Exception {
        for(int i=0; i<1000; i++){

                value.decrement(i);


        }
        return null;
    }
}
