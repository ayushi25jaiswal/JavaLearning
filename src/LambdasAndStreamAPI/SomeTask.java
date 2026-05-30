package LambdasAndStreamAPI;

import java.sql.SQLOutput;

public class SomeTask implements Runnable  {

    public SomeTask() {
        System.out.println("Sometask");

    }

    @Override
    public void run() {
        System.out.println(" using normal ");
    }
}
