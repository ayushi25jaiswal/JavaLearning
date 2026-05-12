package IntroToThread;

public class HelloWorld implements Runnable{

    public void print()
    {
        System.out.println("Hello World " + Thread.currentThread().getName());
    }

    public void run(){
        print() ;
        System.out.println(Thread.currentThread().getName());
    }
}
