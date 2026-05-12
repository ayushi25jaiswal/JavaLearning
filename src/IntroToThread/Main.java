package IntroToThread;

public class Main {
    static void main() {

        HelloWorld hello = new HelloWorld();
        System.out.println("hello from " + Thread.currentThread().getName());

        Thread t = new Thread(hello);
        t.start();

    }
}
