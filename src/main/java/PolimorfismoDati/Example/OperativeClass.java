package PolimorfismoDati.Example;

public class OperativeClass {
    public OperativeClass(FirstClass fc) {
        fc.firstMethod();
        fc.thirdMethod();
        some(new c());
    }

    public void some(InterfaceOne io) {
        io.quancosa();
    }

    class c implements InterfaceOne{
        @Override
        public void quancosa() {
            System.out.println("qualcosa di nuovo");
        }
    }
    public static void main(String[] args) {
        SubClass sc = new SubClass();
        new OperativeClass(sc);
    }

}
