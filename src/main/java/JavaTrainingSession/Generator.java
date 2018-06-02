package JavaTrainingSession;

import java.util.Iterator;

public class Generator implements Iterator
{


    public static void main(String args[])
    {
        Generator g = new Generator();
        while (g.hasNext()) {
            System.out.println(g.next());
        }

    }

    int i = 0;
    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Object next() {
        return ++i;
    }
}