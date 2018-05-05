package PolimorfismoDati;

public class Dipendenti {


    public int i = -1;

    public class Dirigenti extends Dipendenti {
        public int i = 0;
    }

    public class Programmatori extends Dipendenti {
        public int i = 1;
    }

    public static void main(String[] args) {
        Dipendenti d = new Dipendenti().new Dirigenti();
        Dipendenti d1 = new Dipendenti().new Programmatori();

        Dipendenti d2[] = new Dipendenti[]{d, d1};

        for (Dipendenti d3: d2) {
            if (d3 instanceof Dirigenti) {
                System.out.println(((Dirigenti) d3).i);
            } else {
                System.out.println(d3.i);
            }
        }
    }
}
