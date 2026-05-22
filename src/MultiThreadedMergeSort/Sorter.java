package MultiThreadedMergeSort;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Sorter implements Callable <List<Integer>> {

    private List<Integer> arrayToBeSorted;
    private ExecutorService executor;

    public Sorter (List<Integer> arrayToBeSorted, ExecutorService executor){
        this.arrayToBeSorted = arrayToBeSorted;
        this.executor = executor;
    }

    @Override
    public List<Integer> call() throws Exception {

        System.out.println("Current thread " + Thread.currentThread());
        System.out.println("Array "+ arrayToBeSorted);

        if(arrayToBeSorted.size() <= 1){
            return arrayToBeSorted;
        }

        int size = arrayToBeSorted.size();
        int mid = size/2;

        List<Integer> LeftArray = arrayToBeSorted.subList(0, mid);
        List<Integer> RightArray = arrayToBeSorted.subList(mid, arrayToBeSorted.size());

        Sorter LeftArraySorterTask = new Sorter(LeftArray, executor);
        Sorter RightArraySorterTask = new Sorter(RightArray, executor);

//        ExecutorService executorService = Executors.newFixedThreadPool(2);
        //Runnable execute
        //Callable submit

        Future<List<Integer>> LeftArrayFuture = executor.submit(LeftArraySorterTask);
        Future<List<Integer>> RightArrayFuture = executor.submit(RightArraySorterTask);

        //get function will block the current thread until the data is returned.
        List<Integer> LeftSorted = LeftArrayFuture.get();
        List<Integer> RightSorted = RightArrayFuture.get();

        //will merge

        int i=0;
        int j=0;

        List<Integer> sortedArray = new ArrayList<>();
        while(i<LeftSorted.size() && j< RightSorted.size()){

            if(LeftSorted.get(i) <= RightSorted.get(j)){
                sortedArray.add(LeftSorted.get(i));
                i++;
            }else {
                sortedArray.add(RightSorted.get(j));
                j++;
            }
        }

        while(i<LeftSorted.size()){
            sortedArray.add(LeftSorted.get(i));
            i++;
        }
        while(j<RightSorted.size()){
            sortedArray.add(RightSorted.get(j));
            j++;
        }

        return sortedArray;
    }
}
