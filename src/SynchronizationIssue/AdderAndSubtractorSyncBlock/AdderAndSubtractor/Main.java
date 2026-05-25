package SynchronizationIssue.AdderAndSubtractorSyncBlock.AdderAndSubtractor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    static void main(String[] args) throws ExecutionException, InterruptedException {
        Value value = new Value();

        Adder add = new Adder(value);
        Subtractor sub = new Subtractor(value);

        ExecutorService executor = Executors.newFixedThreadPool(2);

        Future<Void> FutureAdder = executor.submit(add);
        Future<Void> FutureSubtractor = executor.submit(sub);

        FutureAdder.get();
        FutureSubtractor.get();

        System.out.println(value.getX());


    }
}
