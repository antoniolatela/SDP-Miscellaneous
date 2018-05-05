package PolimorfismoDati.Diamond;

public interface ImplementationA extends FirstInterface {
    default int some() {
        return 1;
    }
}
