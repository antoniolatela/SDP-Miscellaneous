package misc;

public class Swap {
    public static void main(String[] args) {
        int x = 100;
        int y = 200;
        System.out.println(x + " " + y);
        swap( x, y );
        System.out.println(x + " " + y);
        new interna(x, y);
        System.out.println(x + " " + y);

    }

    public static void swap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
        System.out.println(x + " " + y);
    }

    static class interna {
        int x;
        int y;
        public interna(int x, int y){
            this.x = y;
            this.y = x;
        }

        @Override
        public String toString() {
            return (x + " " + y);
        }
    }

}