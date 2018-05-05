package PolimorfismoDati.Example;

public class CallFinal extends FinalEredita {
    public CallFinal() {
        someFinal();
        super.i = 1;
    }

    public static void main(String[] args) {
        new CallFinal().someFinal();
    }
}
