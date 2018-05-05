package interfaceExample;

public class anotherClass implements InterfaceOne, InterfaceTwo {
    @Override
    public int getI(int i) {
        return InterfaceOne.i;
    }
}
