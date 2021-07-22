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


}
