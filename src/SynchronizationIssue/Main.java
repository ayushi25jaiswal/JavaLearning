package SynchronizationIssue;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

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
