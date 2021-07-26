package lab3;

import java.util.Arrays;

public class prob4 {

    static int[] sort(int[] datas) {
        int len = datas.length;
        int j = 0;
        int k = len - 1;
        for (int i = 0; i <= k; i++) {
            if (datas[i] == 2) {
                if(datas[k] == 2) k--;
                swap(i, k--, datas);
            }
            if (datas[i] == 0) {
                swap(i, j, datas);
                j++;
            }
            System.out.println(i + " " + Arrays.toString(datas));

        }
        return datas;
    }

    // As shown in sort method above, only one for loop is used. so worst case will be O(n).

    static void swap(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] datas = {2, 2, 0, 2, 2, 1, 1, 0, 0, 2, 0};
        System.out.println(Arrays.toString(prob4.sort(datas)));
    }

}
