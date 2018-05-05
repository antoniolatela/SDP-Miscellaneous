package misc;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Iterators {
    ArrayList a = new ArrayList();
    Array array;
    int [] x,y,z;
    int b[] = new int[10];

    public Iterators() {
        x = new int[10];
        float f = 0.1f+0.1f+0.1f-(float) Double.parseDouble("0.3");
        double d = 0.1d;
        Double[] d1 = new Double[10];
        double d2[] = new double[10];
        int i = 0;
        for (Double d3 : d2) {
            d2[i] = i + 0.1;
            System.out.println("->" + d3);
            i++;
        }
        for (Double d3 : d2) {
            //d2[i] = i + 0.1;
            System.out.println("-> " + d3);
        }

        String _òèéçòàùì_ = "" + f;
        a.add(_òèéçòàùì_);
    }

    public static void main(String[] args) {
        Iterator i = new Iterators().a.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
            i.remove();
        }

        for (Iterator i1 = new Iterators().a.iterator(); i1.hasNext();) {
            System.out.println(i1.next());
        }

        for (Object i2: new Iterators().a) {
            System.out.println(i2);
        }
    }
}
