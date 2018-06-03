package enumeration;

import java.util.Arrays;
import java.util.Collections;

interface i {
    String print();
}
public enum EnumTest implements i {
    a, b(3), c;
    int i;

    EnumTest(){
        this.i = 0;
    }

    EnumTest(int i){
        this.i = i;
    }

    @Override
    public String  print() {
        return ("some " + this.name());
    }

    c1 d = new c1() {
        class c2{

        }

        @Override
        void testEnum() {
            super.testEnum();
            System.out.println("Sono qui! " + EnumTest.this.name());
        }
    };
}

class c1 {

    void testEnum () {
        System.out.println(EnumTest.a);
        System.out.println(EnumTest.a.print());
    }

    public static void main(String[] args) {
        new c1().testEnum();
        if (Arrays.asList(EnumTest.values()).contains(EnumTest.a)) EnumTest.a.d.testEnum();

        for (EnumTest e : EnumTest.values()) {
            System.out.println(e.name() + e.ordinal());
        }
    }
}