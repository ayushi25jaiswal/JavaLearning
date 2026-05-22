package IntroToThread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    static void main() {

//        HelloWorld hello = new HelloWorld();
//        System.out.println("hello from " + Thread.currentThread().getName());
//
//        Thread t = new Thread(hello);
//        t.start();
//        ExecutorService executorService = Executors.newFixedThreadPool(10);

        // can use newCachedThreadPool -> if no thread is free create new one
        ExecutorService executorService = Executors.newCachedThreadPool();
        for(int i=1; i<=100; i++){
            if (i == 80){
                System.out.println();
            }

            printNumber currNum = new printNumber(i);

//            Thread t = new Thread(currNum);
//            t.start() ;

            // we dont want to create new thread each time
            executorService.execute(currNum);

        }

    }
}
