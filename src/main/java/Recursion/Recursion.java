package Recursion;

public class Recursion {
    void testRecursion(int i) {
        System.out.print("arrived ");
        System.out.println(i);
        if (i == 2) {System.out.println(i); return;}

        System.out.println("calling " + (i+1));
        testRecursion(i+1);
        System.out.println("finish " + (i+1));
    }

    public static void main(String[] args) {
        new Recursion().testRecursion(0);

    }
}
