package collectionsTest;

import java.util.*;
import java.util.stream.Stream;

public class StreamTest {
    class a{
        public String name;
        public String surname;

        public a(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }

        public String getName(){
            return this.name;
        }
        public String getSurame(){
            return this.surname;
        }
    }

    a[] x = {new a("x", "latela"), new a("raffaele", "latela"), new a("ale", "cla")};
    List<String> l = new ArrayList<>();
    List<String> s = new ArrayList<>(List.of("d", "z", "h"));
    //a[] x = {};

    void testOptional(){
        l.add("");
        List<a> l = new ArrayList(List.of(x));
        Collections.sort(l, (a, b) -> (a).name.compareToIgnoreCase((b).name));
        Collections.sort(l, (a, b) -> (a).name.compareToIgnoreCase((b).name));
        Collections.sort(s, String::compareToIgnoreCase);
        s.stream().forEach(System.out::println);
        l.stream().map(a::getName).forEach(System.out::println);
        //for (a z:x) Optional.ofNullable(z).filter(a->a.name=="x").ifPresent(a-> a.surname="changed");
        //Stream.of(x).map(a::getSurame).forEach(System.out::println);

    }

    public static void main(String[] args) {
        StreamTest st = new StreamTest();
        st.testOptional();
        System.out.println(st.hashCode());
        //Stream.of(st.x).filter(x->x.name=="x").forEach(x->x.name="new");
        //Stream.of(st.x).map(a::getName).forEach(System.out::println);
    }
}
