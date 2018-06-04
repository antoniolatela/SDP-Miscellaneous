package Compare;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Stream;

public class ComparableTest implements Comparator<String> { //<T extends Comparable<T>> {
    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }

    class mia {
        Integer a;
        Integer b;

        public mia(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }



    public static void main(String[] args) {
        ComparableTest ct = new ComparableTest();
        List<ComparableTest.mia> l = new ArrayList(Arrays.asList(new ComparableTest().new mia(1,2), new ComparableTest().new mia(-1,2)));
        List<Integer> l1 = Arrays.asList(1,2,3,4);

        System.out.println(new SimpleDateFormat("dd-MM-yyyy hh:mm:ss:SSSS").format(new Date()));
        System.out.println(DateFormat.getTimeInstance(DateFormat.DATE_FIELD).format(new Date()));

        Collections.sort(l, Comparator.comparing(a -> a.a));
        Collections.sort(l1, Comparator.reverseOrder());

        System.out.println(l.get(0).a);
        System.out.println(l1);

        Collections.sort(l1, Comparator.naturalOrder());
        System.out.println(l1);


    }


}
