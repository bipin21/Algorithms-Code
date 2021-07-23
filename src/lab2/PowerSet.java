package lab2;

import java.util.*;

public class PowerSet {

    static List<Set<Integer>> powerSet(List<Integer> X) {
        List<Set<Integer>> P = new ArrayList<Set<Integer>>();
        Set<Integer> S = new HashSet<>();
        P.add(S);
        while (!X.isEmpty()) {
            Integer f = X.remove(0);
            int pSize = P.size();
            for (int x = 0; x < pSize; x++) {
                HashSet<Integer> T = new HashSet<>();
                T.addAll(P.get(x));
                T.add(f);
                P.add(T);
            }
        }
        return P;
    }


    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(10);

        System.out.println(powerSet(list));
    }

    public static int[] countZeroAndOnes(int[] input) {
        if (input == null || input.length == 0)
            return new int[] { 0, 0 };
        if (input[0] == 1)
            return new int[] { 0, input.length };
        if (input[input.length - 1] == 0)
            return new int[] { input.length, 0 };
        int[] result = new int[2];
        for (int item : input) {
            if (item == 0)
                result[0] = result[0] + 1;
            else
                result[1] = result[1] + 1;
        }
        return result;
    }

}
