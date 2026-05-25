package SynchronizationIssue.AdderAndSubtractorSyncMethods.AdderAndSubtractor;

public class Value {

    private int x;

    public int getX(){
        return x;
    }

    public void setX(int x){
        this.x = x;
    }

    public synchronized void increment(int i){
        x = x+i;
    }
    public synchronized void decrement(int i){
        x = x-i;
    }
}
