package datastructure.Queue;

public class Queue<T> {

    private int INITIAL_VALUE = 10;

    private T[] array;

    private int head = -1;
    private int tail = -1;

    public Queue() {
        array = (T[]) new Object[INITIAL_VALUE];
    }

    public void enqueue(T t) {
        if (head == -1) {
            head += 1;
            tail += 1;
            array[tail] = t;
        } else {
            int difference = Math.abs((tail % INITIAL_VALUE) - (head % INITIAL_VALUE));
            if ((difference >= 0) && (difference < INITIAL_VALUE - 1)) {
                tail = (tail + 1) % INITIAL_VALUE;
                array[tail] = t;
            } else {
                throw new ArrayIndexOutOfBoundsException("Stack over limit!");
            }
        }
    }
/*    public void enqueue(T t) {

        if (head-((tail+1)%INITIAL_VALUE) == 1) {
            System.out.println("overflow");
        } else if (tail == INITIAL_VALUE) {
            tail = 1;
        } else if (tail == -1 && head == -1) {
            head += 1;
            tail += 1;
            array[tail] = t;
        } else {
            tail += 1;
            array[tail] = t;
        }

    }*/

    public T dequeue() {
        if (head == tail && tail == -1) throw new ArrayIndexOutOfBoundsException("Empty queue!");
        T headTmp = array[this.head];
        array[this.head] = null;
        this.head += 1;
        return headTmp;
    }

    public T peek() {
        return array[this.head];
    }

    @Override
    public String toString() {
        String output = "";
        if (head > -1) {
            output += ("{");
            for (int i = head; i < array.length; i++) {
                if (array[i] != null) output += array[i].toString() + ((i < tail || tail < head) ? ", " : "");
            }
            if (tail < head) {
                for (int i = 0; i <= tail; i++) {
                    if (array[i] != null) output += array[i].toString() + ((i < tail) ? ", " : "");
                }
            }
            output += ("}");
        } else output = "{}";
        return output;
    }

    public static void main(String[] args) {
        Queue<Queue> q = new Queue<>();
        Queue<Integer> qq = new Queue<>();
        qq.enqueue(1);
        q.enqueue(qq);
        q.enqueue(qq);
        System.out.println(q);
    }
}
