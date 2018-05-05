package PolimorfismoDati.Diamond;

public interface ImplementationB extends FirstInterface {
    default int some() {
        return 0;
    }
}
