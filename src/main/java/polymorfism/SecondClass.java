package polymorfism;

public class SecondClass extends FirstClass{
    public SecondClass(int i) {
        super(i);
    }

    public SecondClass() {
        this(1);
    }

    public void aMethod(int i) {
        System.out.println(i);
    }

    @Override
    protected void aMethod() {
        getSome();
        super.aMethod();
        System.out.println("Second");;
    }

    @Override
    public int anotherMethod() {
        return 2;
    }

    public static void main(String[] args) {
        System.out.println(new SecondClass().printSomeInAbstract());
        System.out.println(new SecondClass(123).getI());
        new SecondClass().aMethod();
        new SecondClass().aMethod(1);
        System.out.println(new SecondClass().anotherMethod());
    }
}
