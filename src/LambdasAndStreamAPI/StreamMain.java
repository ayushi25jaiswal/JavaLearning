package LambdasAndStreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {
    static void main(String[] args) {

        List<Integer> list = List.of(2, 56, 35, 3, 2, 78, 89, 34, 67, 23, 78);

        Stream<Integer> stream = list.stream();


        List<Integer> EvenNumberList =
                stream
                        .filter(element -> element%2==0)
                        .collect(Collectors.toList());


        System.out.println(EvenNumberList);

        //stream is closed

        //Map
        List<Integer> Squares =
                list
                        .stream()
                        .map(element -> element*element)
                        .collect(Collectors.toList());


        System.out.println(Squares);


        List<Integer> FinalOutput =
                list
                        .stream()
                        .filter(element -> element%2==0)
                        .map(element -> element*element)
                        .distinct()
                        .sorted()
                        .collect(Collectors.toList());

        System.out.println(FinalOutput);
    }
}
