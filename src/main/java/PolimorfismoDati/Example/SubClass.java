package PolimorfismoDati.Example;

public class SubClass extends FirstClass {
    @Override
    int firstMethod() {
        System.out.println("print sub1");
        return 0;
    }

    @Override
    String SecondMethod() {
        return null;
    }
}
