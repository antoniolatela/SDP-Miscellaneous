package misc;

import java.util.Objects;

public class Equality {
    int i;
    int i1;

    public Equality( int i) {
        this.i = i;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Equality equality = (Equality) o;
        return i == equality.i &&
                i1 == equality.i1;
    }

    @Override
    public int hashCode() {

        return Objects.hash(i, i1);
    }

    public static void main(String[] args) {

        String s = "s";
        String s1 = "s";
        System.out.println("ciao".equals("ciao"));
        System.out.println("ciao" == "ciao");
        System.out.println(s.equals(s1));
        System.out.println(s == s1);
        System.out.println(new Equality(1).equals(new Equality(1)));
        System.out.println(new Equality(1).i == (new Equality(1)).i);


    }

}
