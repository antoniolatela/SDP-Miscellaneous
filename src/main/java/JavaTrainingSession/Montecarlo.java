package JavaTrainingSession;

import java.util.Random;
import java.util.stream.IntStream;

public class Montecarlo {
    boolean b = true;
    boolean w = false;

    public int total = 0;
    public int results = 0;

    public boolean testMC() {
        boolean[] bw = {b, b, b, w, w, w};
        boolean[] out = new boolean[3];

        for (int i = 0; i < 3; i++) {
            int j = new Random().nextInt(bw.length);
            out[i] = bw[j];
            boolean[] tmp = new boolean[bw.length - 1];
            int w = 0;
            for (int z = 0; z < bw.length; z++) {
                if (z != j) {
                    tmp[w++] = bw[z];
                }
            }
            bw = tmp;
        }
        boolean tmp = out[0];
        for (boolean b : out) {
            if (b != tmp) return false;
            else {
                tmp = b;
            }
        }
        for (boolean b: bw) {
        }
        return true;
    }

    public static void main(String[] args) {
        Montecarlo m = new Montecarlo();
        IntStream.range(1, 10000000).forEach(i -> {
            if (m.testMC()) {
                m.total += 1;
                m.results += 1;
            } else {
                m.total += 1;
            }
        });

        System.out.println(((float)m.results/(float)m.total)*100);
    }


}
