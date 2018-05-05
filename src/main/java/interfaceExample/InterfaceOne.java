package interfaceExample;

public interface InterfaceOne extends aThirdInterface {
    int i = -1;

    default int getI() {
        return i;
    }

    public int getI(int i);
}
