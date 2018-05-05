package misc;

public class SwitchCase {

    public SwitchCase(int value) {
        switch (value) {
            case 0:
                System.out.println(0);
                break;
            case 1:
                System.out.println(1);
                break;
            default:
                System.out.println(-1);
                break;
        }
    }

    public SwitchCase(String value) {
        switch (value) {
            case "ant":
                System.out.println(1000);
                break;
            case "b":
                System.out.println(1);
                break;
            default:
                System.out.println(-1);
                break;
        }
    }

    public void assertion (){
        int a=0;
        if (a == 1) throw new AssertionError(a = 1000);
        assert 1==1;
        System.out.println(a);
    }

    public static void main(String[] args) {
        new SwitchCase("ant").assertion();
    }
}
