package bigO;

public class SelectionSort {
    int data[] = new int[1000];

    public SelectionSort() {
        push();
        for (int i : data) System.out.print(i + " ");

        for (int i=0; i<data.length; i++) {
            for (int j=i+1; j<data.length; j++) {
                if (data[i]>data[j]) swap(i, j);
            }
        }
        System.out.println();
        for (int i : data) System.out.print(i + " ");

    }

    void push () {
        for (int i=0; i<data.length; i++) {
            data[i] = new java.util.Random().nextInt(2);
        }
    }

    void swap (int i, int j) {
        int tmp = data[i];
        data[i] = data[j];
        data[j] = tmp;
    }

    public static void main(String[] args) {
        new SelectionSort();
    }
}
