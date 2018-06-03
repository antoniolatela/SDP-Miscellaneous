package collectionsTest;

import java.util.Optional;
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
    }

    a[] x = {new a("x", "latela"), new a("raffaele", "latela"), new a("ale", "cla")};
    //a[] x = {};
    void testOptional(){
        Stream.of(x).map(a->a.name).forEach(System.out::println);
        for (a z:x) Optional.ofNullable(z).filter(a->a.name=="x").ifPresent(a-> System.out.println(a.surname));
        Stream.of(x).map(a::getName).forEach(System.out::println);

    }

    public static void main(String[] args) {
        StreamTest st = new StreamTest();
        st.testOptional();
        Stream.of(st.x).filter(x->x.name=="x").forEach(x->x.name="new");
        Stream.of(st.x).map(a::getName).forEach(System.out::println);
    }
}
