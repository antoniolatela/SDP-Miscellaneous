package AnonymClass;

import JavaTrainingSession.Montecarlo;

import java.util.stream.IntStream;

public class AnonymClass {
    interface IF {
        int i = 0;
        void firstMethod();
        default void print(String s) {
            System.out.println("ciao interfaccia! " + s);
        }
    }

    class test{
        int i;
        public test(int i){
            this.i = i;

        }
    }

    Montecarlo nc = new Montecarlo() {
        @Override
        public boolean testMC() {
            IntStream.range(1, 1000).forEach(i -> {
                if (super.testMC()) {
                    super.total += 1;
                    super.results += 1;
                } else {
                    super.total += 1;
                }
            });
            System.out.println(((float)super.results/(float)super.total)*100);
            return true;
        }
    };

    IF i = new IF() {
        @Override
        public void firstMethod() {
            print(":-)");
        }
    };

    public static void main(String[] args) {
        new AnonymClass().nc.testMC();
        new AnonymClass().i.firstMethod();
    }
}
