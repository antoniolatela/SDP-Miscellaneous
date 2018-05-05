package polymorfism;

public class FirstClass extends AbstClass {
    int i;

    public int getI() {
        return i;
    }

    static int getSome() {
        return 1;
    }

    public FirstClass(int i) {
        this.i = i;
    }

    protected void aMethod(){
        System.out.println("first");
    }

    public int anotherMethod() {
        return 1;
    }

    @Override
    public void printa() {
        System.out.println("printa");
    }
}
