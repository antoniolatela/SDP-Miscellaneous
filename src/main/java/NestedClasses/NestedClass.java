package NestedClasses;

import java.util.stream.IntStream;

public class NestedClass {

    int o = 10;
    protected class c1 {
        Object[] c = {NestedClass.class};

        int i = 0;
        int getO(){
            return o;
        }
    }
    private class c2 {
        int i = 1;
    }

    private abstract class c3 {
        abstract NestedClass some();
    }

    class c4 extends c3 {
        @Override
        NestedClass some() {
            System.out.println("some abstract!");
            NestedClass.this.some();
            return NestedClass.this;
        }
    }

    NestedClass some(){
        IntStream.range(1,10).forEach(i->{class c3{
            void print(String s) {
                System.out.println(s + o++);
                Runnable r = () -> {synchronized (this) {System.out.println("Ciao Bello!");
                o++;}};
                new Thread(r).start();
            }
        } new c3().print("ciao - " + i);});
        return this;
    }

    public static void main(String[] args) {
        System.out.println(new NestedClass().new c4().some().some().o);

    }
}
