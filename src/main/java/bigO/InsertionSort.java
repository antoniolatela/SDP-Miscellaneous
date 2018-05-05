package bigO;

public class InsertionSort {

    int data[] = new int[1000];

    public InsertionSort() {
        push();
        for (int i : data) System.out.print(i + " ");

        for (int i = 0; i < data.length; i++) {
            int current = data[i];
            int j = i-1;

            while (j>=0 && data[j] > current) {
                data[j+1] = data[j];
                j = j-1;
            }
            data[j+1] = current;

        }

        System.out.println();
        for (int i : data) System.out.print(i + " ");

    }

    void push () {
        for (int i=0; i<data.length; i++) {
            data[i] = new java.util.Random().nextInt(2);
        }
    }

    public static void main(String[] args) {
        new InsertionSort();
    }
}
