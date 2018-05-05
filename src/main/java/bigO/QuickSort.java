package bigO;

import java.lang.reflect.Array;
import java.util.*;

public class QuickSort {
    Double i[] = new Double[10];

    void Sort (int start, int end) {
        for (int x = 0; x< i.length; x++) {
            i[x] = Math.random();
        }

        List<Double> l = Arrays.asList(i);

        System.out.println(l);
        l.sort((a, b) -> a.compareTo(b));
        System.out.println(l);

        int partitionIndex = partition(start, end, i[end]);
    }

    int partition (int start, int stop, Double pivot) {
        return 0;
    }

    public static void main(String[] args) {
        new QuickSort().Sort(1,2);
    }
}
