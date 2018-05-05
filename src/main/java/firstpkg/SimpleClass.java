package firstpkg;

public class SimpleClass extends AnotherClass{
    void printSome (String s) {
        System.out.println(s);
    }
    public class SubClass {
        public SubClass () {
            System.out.println("hello2");
            printa("Hi");
        }
        protected void some() {
            System.out.println("I'm protected");
        }
        public void some1() {
            System.out.println("I'm public");
        }
    }

    public static void main(String[] args) {
        new SimpleClass().printSome("hello1");
        new SimpleClass().new SubClass().some();
    }
}

