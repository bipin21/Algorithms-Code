package lab4;

import java.util.Arrays;

public class MergeSortPlus {

    static int[] theArray = new int[]{0,1,2,3,4,5,6};
//    static int[] theArray = new int[]{7, 6, 5, 4, 3, 2, 1};

    static int distinct = 0;
    public static boolean distinctNums(int[] Arr, int l, int r){
        distinct++;
        int mid = (l+r)/2;
        if(Arr[mid] != mid) return false;
        if(Arr[mid] == l || Arr[mid] == r) return true;
        return distinctNums(Arr, l , mid) && distinctNums(Arr, mid+1, r);
    }

    //public sorter
    public int[] sort(int[] input) {
        int n = input.length;
        int[] tempStorage = new int[n];
        tempStorage = input;
        mergeSort(tempStorage, 0, n - 1);
        theArray = tempStorage;
        return theArray;
    }

    void mergeSort(int[] temp, int lower, int upper) {
        if (lower == upper) {
            return;
        } else if (upper - lower < 20) {
            insertionSort(lower, upper);
        } else {
            int mid = (lower + upper) / 2;
            mergeSort(temp, lower, mid);
            mergeSort(temp, mid + 1, upper);

            merge(temp, lower, mid + 1, upper);
        }
    }

    void insertionSort(int lowerBound, int upperBound) {
        int count = 0;
        if (theArray == null || theArray.length <= 1)
            return;

        int temp = 0;
        int j = 0;
        for (int i = lowerBound; i <= upperBound; i++) {
            temp = theArray[i];
            j = i;
            while (j > 0 && temp < theArray[j - 1]) {
                count++;
                theArray[j] = theArray[j - 1];
                j--;
            }
            theArray[j] = temp;
        }

    }

    public void merge(int[] tempStorage,
                      int lowerPointer,
                      int upperPointer,
                      int upperBound) {
        int j = 0; //tempStorage index
        int lowerBound = lowerPointer;
        //total number of elements to rearrange
        int n = upperBound - lowerBound + 1;
        //view the range [lowerBound,upperBound] as two arrays
        //[lowerBound, mid], [mid+1,upperBound] to be merged
        int mid = upperPointer - 1;
        int temp = 0;
        int count = 0;

        while (lowerPointer <= mid && upperPointer <= upperBound) {
            count++;
            if (theArray[lowerPointer] <= theArray[upperPointer]) {
                tempStorage[j++] = theArray[lowerPointer++];
            } else {
                tempStorage[j++] = theArray[upperPointer++];
            }
        }

        //left array may still have elements
        while (lowerPointer <= mid) {
            count++;
            tempStorage[j++] = theArray[lowerPointer++];
        }
        //right array may still have elements
        while (upperPointer <= upperBound) {
            count++;
            tempStorage[j++] = theArray[upperPointer++];
        }
        //replace the range [lowerBound,upperBound] in theArray with
        //the range [0,n-1] just created in tempStorage
        for (j = 0; j < n; ++j) {
            count++;
            theArray[lowerBound + j] = tempStorage[j];
        }


        System.out.println("Run time: " + count);
    }


    public static void main(String[] args) {
//        MergeSortPlus ms = new MergeSortPlus();
//        ms.sort(theArray);
//        System.out.println(Arrays.toString(theArray));
        System.out.println(distinctNums(theArray, 0, theArray.length-1));
        System.out.println(distinct);
    }


}
