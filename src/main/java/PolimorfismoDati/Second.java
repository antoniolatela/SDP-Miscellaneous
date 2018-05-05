package PolimorfismoDati;

public class Second extends First {
    int i = 0;

    public void two(int i){
        System.out.println("two " + i);
    }

    public Second getSecond(Second s) {
        s.i = 1;
        System.out.println(s.i + " " + s);
        getSecondTwo(s);
        System.out.println(s.i + " " + s);
        return s;
    }

    public Second getSecondTwo(Second s) {
        s.i = 2;
        System.out.println(s.i + " " + s);
        s.one();
        return s;
    }


    public static void main(String[] args) {
        First f = new Second();
        //f.one();
        System.out.println(f);
        ((Second)f).getSecond(((Second)f));
        System.out.println(((Second)f).i + " " + f);
    }
}
