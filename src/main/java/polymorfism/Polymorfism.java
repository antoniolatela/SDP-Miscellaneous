package polymorfism;

public class Polymorfism {

    protected <T> void test (T... list) {
        for (T t : list)
            if (t instanceof Polymorfism) { ((Polymorfism) t).test("ciao");} //casting a type ((type)var).method()
            else if (t instanceof String ) System.out.println(t);
    }

    public static void main(String[] args) {
        Polymorfism o = new Polymorfism();

        System.out.println(((Object)o).equals(o) + " " + o + " " + ((Object)o));

        new Polymorfism().test(new Polymorfism());
    }

}
