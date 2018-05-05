package PolimorfismoDati.Diamond;

public class MainClas implements ImplementationA, ImplementationB {


/*    @Override
    public int some(Object fi) {
        return (FirstInterface)fi.super.some();
    }*/

    public static void main(String[] args) {
        System.out.println(new MainClas());
    }

    @Override
    public int some() {
        return 0;
    }
}
