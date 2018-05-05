package reflection;

import java.lang.reflect.*;

public class JavaReflection {
    private String s = "brutto";

    public JavaReflection() {
        System.out.println("empty instance");
    }

    public JavaReflection(String s) {
        this.s = s;
    }

    public JavaReflection(JavaReflection t) {
        t.printCiao();
    }

    public JavaReflection(Integer i) {
        System.out.println(i);
    }

    public void printCiao() {
        System.out.printf("Ciao " + this.s);
    }

    public void printCiao1(String s) {
        System.out.printf("Ciao " + s);
    }

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, ClassNotFoundException, InstantiationException, NoSuchMethodException {
        //from a class
        Class<JavaReflection> test = JavaReflection.class;
        for (Method m: test.getMethods()){
            //System.out.println(m.getName());
        }

        //from an instance
        JavaReflection t = new JavaReflection("bello");
        Class test1 = t.getClass();
        Method m1 = (Method)test1.getMethods()[1];
        //m1.invoke(t);
        for (Method m: test.getMethods()){
            //System.out.println(m.getName());
        }

        //from a stirng
        Class<?> some = Class.forName("reflection.JavaReflection");
        for (Method m: test.getMethods()){
            //System.out.println(m.getName());
        }
        Method m2 = (Method)test1.getMethods()[2];
        //m2.invoke(some.getConstructor(String.class).newInstance("bello"));
        //m2.invoke(some.getConstructor(JavaReflection.class).newInstance(new JavaReflection("bello")));
        Object o = some.getConstructor().newInstance();
        //m2.invoke(some.getConstructor().newInstance(), "bellissimo");

        JavaReflection.class.getMethod("printCiao1", String.class).invoke(o, "bello");
    }

}
