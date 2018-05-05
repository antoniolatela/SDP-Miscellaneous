package interfaceExample;

import polymorfism.*;

public class aClass extends FirstClass implements InterfaceTwo {
    public aClass() {
        super(1);
        InterfaceTwo.printa();
    }

    @Override
    public int getI(int i) {
        return getI();
    }

    int overLoad(int i) {
        return i;
    }

    void overLoad() {

    }


    public static void main(String[] args) {
        System.out.println(new aClass().getI(1));
    }
}
