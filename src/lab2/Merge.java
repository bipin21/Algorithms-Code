package lab2;

import java.util.Arrays;

public class Merge {

    static int[] merge(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        if (m == 0 && n == 0) return null;
        int len = m + n;
        int[] res = new int[len];
        int x = 0, y = 0;
        for (int i = 0; i < len; i++) {
            if (x == m) {
                res[i] = arr2[y++];
            } else if (y == n) {
                res[i] = arr1[x++];
            } else if (arr1[x] < arr2[y]) {
                res[i] = arr1[x++];
            } else {
                res[i] = arr2[y++];
            }
        }

        return res;


    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(merge(new int[]{2, 4, 8, 11, 13, 21, 23, 25}, new int[]{1, 4, 5, 8, 17})));
    }
}
