package lab3;

import java.util.Arrays;

public class BubbleSort {
    static int[] arr = {1, 10, 12, 4, 5, 7};
    void sort() {
        int len = arr.length;
        for (int i = 0; i < len; ++i) {
            for (int j = 0; j < len - 1; ++j) {
                if (arr[j] > arr[j + 1]) {
                    swap(j, j + 1);
                }
            }
        }
    }

    void swap(int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        bs.sort();
        System.out.println(Arrays.toString(arr));
    }
}
