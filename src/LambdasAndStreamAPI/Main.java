package LambdasAndStreamAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    static void main(String[] args) {

        //Method 1
        Runnable someTask = new SomeTask();
        Thread t = new Thread(someTask);
        t.start();

        //using lambda

        Runnable otherTask = () -> {
            System.out.println("using lambda function");
        };

        Thread t1 = new Thread(otherTask);
        t1.start();

        //-----------------------------------------------------------------------------------------
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(18);
        list.add(90);
        list.add(55);
        list.add(2);
        list.add(40);
        list.add(99);

        //Sorting even should come first and then odd in ascending order

        Comparator<Integer> comparator = (o1, o2) -> {
            if(o1 % 2 == 0 && o2 %2 != 0) return -1;
            else if(o2 % 2 == 0 && o1%2 != 0) return 1;

            return Integer.compare(o1, o2);
        };

//        Collections.sort(list, comparator);
//        System.out.println(list);

        Collections.sort(list,(o1, o2) -> {
            if(o1 % 2 == 0 && o2 %2 != 0) return -1;
            else if(o2 % 2 == 0 && o1%2 != 0) return 1;

            return Integer.compare(o1, o2);
        } );
        System.out.println(list);



    }
}
