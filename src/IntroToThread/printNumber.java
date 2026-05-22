package IntroToThread;

public class printNumber implements Runnable{

    int num;

    printNumber(int number){
        this.num = number;
    }

    public void run(){
        System.out.println(num + " Curr Thread : "+ Thread.currentThread().getName()) ;
    }

}
