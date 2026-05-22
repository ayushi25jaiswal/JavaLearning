package IntroToThread;

public class Main {
    static void main() {

//        HelloWorld hello = new HelloWorld();
//        System.out.println("hello from " + Thread.currentThread().getName());
//
//        Thread t = new Thread(hello);
//        t.start();

        for(int i=1; i<=100; i++){

            printNumber currNum = new printNumber(i);

            Thread t = new Thread(currNum);
            t.start() ;
        }

    }
}
