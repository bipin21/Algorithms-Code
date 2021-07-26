package lab3;

import java.util.Arrays;

// lab3 prob2

public class BubbleSort1 {

    static int[] arr = {12, 10, 9, 8, 4, 2, 1};

    void sort() {
        int len = arr.length;
        boolean swaped = false;
        int c = 0;
        for (int i = 0; i < len; ++i) {
            for (int j = 0; j < len - 1; ++j) {
                c++;
                if (arr[j] > arr[j + 1]) {
                    swap(j, j + 1);
                    swaped = true;
                }
            }
            if (swaped == false) break;
        }
        System.out.println("Cost " + c);
    }

    void swap(int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        BubbleSort1 bs = new BubbleSort1();
        bs.sort();
        System.out.println(Arrays.toString(arr));
    }

}
