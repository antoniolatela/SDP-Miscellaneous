package misc;

import javafx.util.converter.TimeStringConverter;

import java.security.Timestamp;

public class BoubleSort {
    int z = 1000;
    int [] intArray = new int[z];
    {
/*
        for (int u = z, x = z; u > 0; u--) {
            intArray[x-u] = u;
        }
*/

    for (int i = 0; i < intArray.length; i++) {
        intArray[i] =  new java.util.Random().nextInt(1000);
    }

/*
    for (int i : intArray) {
        System.out.println(i);
    }
*/

    }



    long BoubleSort1() {
        Long l = System.currentTimeMillis();
        boolean flag = true;
        //int c = 0;
        while (flag) {
            //c++;
            flag = false;
            for (int i = 0; i < intArray.length - 1; i++) {
                if (intArray[i] > intArray[i + 1]) {
                    int tmp = intArray[i];
                    intArray[i] = intArray[i + 1];
                    intArray[i + 1] = tmp;
                    flag = true;
                }
            }
        }
        return (System.currentTimeMillis() - l);

/*        for (int i: intArray) {
            System.out.println(i);
        }*/
        //System.out.println("-> " + c);

    }

    long BoubleSort2() {
        Long l = System.currentTimeMillis();
        //int c = 0;
        for (int j = 0; j < intArray.length - 1; j++) {
            for (int i = 0; i < intArray.length -1-j; i++) {
                if (intArray[i] > intArray[i + 1]) {
                    int tmp = intArray[i];
                    intArray[i] = intArray[i + 1];
                    intArray[i + 1] = tmp;
                }
            }
        }

        for (int i: intArray) {
            System.out.println(i);
        }
        //System.out.println("-> " + c);
        return (System.currentTimeMillis() - l);
    }

    public static void main(String[] args) {
        int c = 0;
        int i = 0;
/*        while (true) {
            if (new BoubleSort().BoubleSort1() > new BoubleSort().BoubleSort2()) {
                c++;
            } else {c--;}
            System.out.println(i++ + " - " + c);
        }*/

        new BoubleSort().BoubleSort2();
    }
}
