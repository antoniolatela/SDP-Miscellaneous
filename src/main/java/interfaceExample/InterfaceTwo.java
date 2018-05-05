package interfaceExample;

public interface InterfaceTwo extends InterfaceOne{
    static void printa(){
        printaQualcosa();
    }
    private static void printaQualcosa() {
        System.out.println("Qualcosa");

    }
}
