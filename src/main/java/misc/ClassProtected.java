package misc;

import firstpkg.AnotherClass;

public class ClassProtected extends AnotherClass {
    public void some() {
        printa("call protected");
    }

    public static void main(String[] args) {
        new ClassProtected().some();
        new ClassProtected().some();
    }
}
