package collectionsTest;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class MapReduceCollect {
    class a {
        String name;
        String surname;
        int age;

        public a(String name, String surname, int age) {
            this.name = name;
            this.surname = surname;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public String getSurname() {
            return surname;
        }

        public int getAge() {
            return age;
        }
    }

    MapReduceCollect.a[] x = {new MapReduceCollect.a("antonio", "latela", 5), new MapReduceCollect.a("raffaele", "latela", 10), new MapReduceCollect.a("ale", "cla", 15)};


    void mapTest(){
        List.of(x).stream().map(a->a.name = a.name.toUpperCase()).forEach(System.out::println);
    }

    int reduceTest() {
        return List.of(x).stream().map(a::getAge).reduce(0, (a,b) -> (a+b))/x.length;
    }

    long fib(int i) {
        return (Long) Stream.iterate(new long[]{0, 1}, s -> new long[]{s[1], s[0] + s[1]})
                .limit(i)
                .map(n -> n[0])
                .collect(Collectors.toList()).toArray()[i-1];
    }

    void iter() {
        Stream.iterate(1, a -> a*2).limit(10).forEach(System.out::println);
    }


    public static void main(String[] args) {
        MapReduceCollect mrc = new MapReduceCollect();
        mrc.mapTest();
        //System.out.println(mrc.reduceTest());
        System.out.printf("%d", mrc.fib(500));
        //mrc.iter();
    }
}
