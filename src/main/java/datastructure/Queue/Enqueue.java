package datastructure.Queue;

public class Enqueue<T> {
    int left = 0;
    int right = 0;
    int MAX_VALUE = 10;
    T[] array = (T[]) new Object[MAX_VALUE];

    void leftEnqueue(T t) {
        if (left == right) {
            array[left] = t;
            if (left==0) left = MAX_VALUE-1; else left -=1;
        }
        else if (left == 0) {
            array[left] = t;
            left = MAX_VALUE - 1;
        } else {
            array[left] = t;
            left -= 1;
        }
    }

    void righitEnqueue(T t) {
        if (left == right) {
            array[right] = t;
            if (right==MAX_VALUE-1) right = 0; else right +=1;
        }
        else if (right == MAX_VALUE - 1) {
            right = 0;
            array[right] = t;
        } else {
            right += 1;
            array[right] = t;
        }
    }

    T leftDequeue() {
        return null;
    }

    T righitDenqueue() {
        return null;
    }

    @Override
    public String toString() {
        String output = "";
        for (T i: array) {
            output += i;
        }
        return output;
    }

    public static void main(String[] args) {
        Enqueue<Integer> e = new Enqueue();
        e.leftEnqueue(1);
        e.leftEnqueue(1);
        e.leftEnqueue(1);
        e.leftEnqueue(1);
        e.righitEnqueue(2);
        e.righitEnqueue(2);
        e.righitEnqueue(2);
        e.leftEnqueue(1);
        e.righitEnqueue(2);
        System.out.println(e.left + " " + e.right);
        System.out.println(e);
    }

}
