package datastructure.Stack;

public class Stack<T> {

    private int INITIAL_VALUE = 10;
    private int pointer = -1;
    private T[] array;

    public Stack() {
        this.array = (T[])new Object[INITIAL_VALUE];
    }

    public void push(T t) {
        if (pointer+1 == INITIAL_VALUE) doubleArray();
        pointer += 1;
        array[pointer] = t;
    }

    public T pop() {
        if (pointer == -1) throw new NegativeArraySizeException("Empty Stack");
        T t = array[pointer];
        array[pointer] = null;
        pointer -= 1;
        return t;
    }

    public T peek(){
        return array[pointer];
    }

    private void doubleArray() {
        int counter = 0;
        INITIAL_VALUE *= 2;
        T[] tmpArray = (T[])new Object[INITIAL_VALUE];
        for (T t: this.array) {
            tmpArray[counter] = array[counter];
            counter += 1;
        }
        array = tmpArray;
    }

    @Override
    public String toString() {
        String output = "";

        output += ("{");
        for (int i=0; i<=pointer; i++) {
            output += (array[i].toString() + ((i<pointer) ? ", "  : ""));
        }
        output += ("}");
        return output;
    }

    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(5);

        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);

    }
}
