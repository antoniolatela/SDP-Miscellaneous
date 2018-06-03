package Generics;

import java.util.*;
import java.util.stream.Stream;


public class GenericTestTwo<T extends Number, K, V extends Stream> {
    T t;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GenericTestTwo<?, ?, ?> that = (GenericTestTwo<?, ?, ?>) o;
        return Objects.equals(t, that.t) &&
                Objects.equals(ar, that.ar);
    }

    @Override
    public int hashCode() {
        return 31 * Objects.hash(t, ar);
    }

    List<Integer> ar = new ArrayList<>() {
        @Override
        public boolean add(Integer  i) {
           if (!super.contains(i)) {
               super.add(i);
               return true;
           }
           return false;
        }
    };

    public void someWildCard(Map<? extends Runnable, HashMap<K, V>> o){
        for (Runnable t:o.keySet()){
            new Thread(t).start();
        }
    }

    public void WildCard(List<?> a) {
        helperWildCard(a);
    }

    private<Z> void helperWildCard(List<Z> t) {
        t.add(0, t.get(0));
    }

    class c {
        public void WildCard(List<?> a) {
            helperWildCard(a);
        }

        private<K> void helperWildCard(List<K> t) {
            t.add(0, t.get(0));
        }
    }

    void  some (T... i){
        T j = (T)Integer.valueOf(i.length);
        for (T x : i) {System.out.println((Integer)j-(Integer)x);}
    }

    public static void main(String[] args) {
        GenericTestTwo<Integer, Integer, Stream> gtt = new GenericTestTwo<>();
        System.out.println(gtt.ar.add(-1));
        System.out.println(gtt.ar.add(1));
        HashMap<Runnable, HashMap<Integer, Stream>> m = new HashMap<>();
        Runnable r = ()->System.out.println("Ciao");

        m.put(r, null);
        gtt.someWildCard(m);
        System.out.println(gtt.hashCode());
    }
}
