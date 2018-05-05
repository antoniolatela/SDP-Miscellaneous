package misc;

public class GCD {
    int getGCD(int m, int n) {
        int r = m%n;
        if (r!=0) {
            return getGCD(n, r);
        }
        return n;
    }

    public static void main(String[] args) {
        System.out.println(new GCD().getGCD(23434,45368));
    }
}
