package misc;

import java.util.Scanner;
import static java.lang.Math.*;

public class ScannerTest {
    Scanner sc;
    String s;

    public ScannerTest() {
        this.sc = new Scanner(System.in);
        while (sc.hasNext()) {
            Double s = sc.nextDouble();
            System.out.println(pow(s,2));
        }
    }

    public static void main(String[] args) {
        new ScannerTest();
    }
}
