package lab3;

import java.util.Arrays;
// lab3 prob3
public class BubbleSortImporved2 {

    static int[] arr = {12, 10, 9, 4, 8, 2, 1};

    void sort() {
        int len = arr.length;
        boolean swaped = false;
        int c = 0;
        int k = len;
        for (int i = 0; i < len; ++i) {
            for (int j = 0; j < k - 1; ++j) {
                c++;
                if (arr[j] > arr[j + 1]) {
                    swap(j, j + 1);
                    swaped = true;
                }
            }
            k = k-1;
            if (swaped == false) break;
        }
        System.out.println(c);
    }

    void swap(int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        BubbleSortImporved2 bs = new BubbleSortImporved2();
        bs.sort();
        System.out.println(Arrays.toString(arr));
    }
}
