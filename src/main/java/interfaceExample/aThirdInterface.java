package interfaceExample;

public interface aThirdInterface {

    int i = -2;
    default int getI() {
        return i;
    }
}
