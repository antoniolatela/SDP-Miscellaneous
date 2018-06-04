package Compare;

import java.util.*;
import java.util.stream.Stream;

public class ComparableTest implements Comparator<String> { //<T extends Comparable<T>> {
    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }



    public static void main(String[] args) {
        ComparableTest ct = new ComparableTest();
        List<String> l = new ArrayList(Arrays.asList("d","c","a"));

        Collections.sort(l, Comparator.naturalOrder());
        Collections.sort(l, Comparator.reverseOrder());

        System.out.println(l);


    }


}
