package MultiThreadedMergeSort;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> arrayToSort = List.of(2,4,5,1,8,9,3);

        ExecutorService exe = Executors.newCachedThreadPool();
        Sorter sorter = new Sorter(arrayToSort, exe);


        Future<List<Integer>> SortedArrayFuture = exe.submit(sorter);

        List<Integer> SortedResult = SortedArrayFuture.get();

        System.out.println(SortedResult);


    }
}
