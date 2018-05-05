package misc;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Timer;

import static org.junit.Assert.*;

public class SwitchCaseTest {
class data{
    int i1 = 1;
    int i2 = 2;
}
    @Before
    public void setUp() {
        System.out.println("inizio");
    }

    @Test
    public void assertion1() {
        assertTrue(true);
    }

    Object getObj(data d, int i) {
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        d.i1=i;
        return d;
    }

    @Test (timeout = 12)
    public void assertion2() {
        data d = new data();

        assertSame("NO!", getObj(d, 1), getObj(d, 20));
        System.out.println(d.i1 + d.i2);

        //assertSame(new String("21"), new String("21"));
        assertTrue(true);
    }

    @Test
    public void assertion3() {
        assertTrue(true);
    }

    @After
    public void finish() {
        System.out.println("finisco");
    }
}