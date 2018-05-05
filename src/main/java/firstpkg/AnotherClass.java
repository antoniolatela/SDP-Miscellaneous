
package firstpkg;
import static java.lang.Math.*;

public class AnotherClass {
    static {
        System.out.println("sono statico ed inizializzato a runtime!");
        System.out.println(sqrt(5*5));
    }
    {
        System.out.println("sono inizializzato");
    }
    public AnotherClass (){
        System.out.println("that's another class");
    }
    protected void printa(String s) {
        System.out.println(s);
        //new SimpleClass().new SubClass().some();
    }
}
