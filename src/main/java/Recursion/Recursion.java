package Recursion;

public class Recursion <T> {
    class tail {
        int tail(int i) {
            if (i==0) return 0;
            else return tail(i - 1) + i;
        }
    }
    void testRecursion(int i) {
        System.out.print("arrived ");
        System.out.println(i);
        if (i == 2) {System.out.println(i); return;}

        System.out.println("calling " + (i+1));
        testRecursion(i+1);
        System.out.println("finish " + (i+1));
    }

    int fact(int i) {
        if (i==0) return 1;
        else return fact(i-1) * i;
    }

    int tailRec(int i) {
        return new tail().tail(i);
    }


    int length(String s, int i) {
        if (s.isEmpty()) return i;
        else {
            s = s.substring(1);
            return length(s, ++i);
        }
    }

    boolean isPal(T s) {
        System.out.println(s);
        if (s.toString().isEmpty()) return true;
        if (s.toString().charAt(0) == s.toString().charAt(s.toString().length()-1)) {
            return isPal((T)(s.toString().substring(1,  s.toString().length()-1)));
        } else return false;
    }

    Double tailFac(int i, double c) {
        if (i == 0) return c;
        else return tailFac(i-1, c*i);
    }
    //ac ab ca ac ba bc ac
    void hanoiTower(int i, int from, int to, int tmp, int c) {
        c += 1;
        if (i == 1) {from-=1; to+=1;
            System.out.println(to); }
            else {
        hanoiTower(i-1, from,tmp,to, c);
        from-=1;
        to+=1;
        hanoiTower(i-1, tmp,to,from, c);
    }
    }

    void rec(String i, int j) {if (j==10) return;
        System.out.println(i + " " + j);
        rec(i,  ++j);
    }

    public static void main(String[] args) {
        System.out.println(new Recursion().isPal("ingirumimusnocteetconsumimurigni"));
        System.out.println(new Recursion<>().tailFac(200,1));
        System.out.println(new Recursion<>().fact(200));
        //new Recursion<>().hanoiTower(10, 3,0,0, 1);
        new Recursion<>().rec("ciao ", 0);
    }


}
