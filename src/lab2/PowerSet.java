package lab2;

import java.util.*;

public class PowerSet {

    static ArrayList<ArrayList<Integer>> powerSet(ArrayList<Integer> X) {
        ArrayList<ArrayList<Integer>> P = new ArrayList<>();
        ArrayList<Integer> S = new ArrayList<>();
        if(X.isEmpty()){
            P.add(S);
        }
        while (!X.isEmpty()) {
            Integer f = X.get(0);
            X.remove(0);
            for (ArrayList<Integer> set : powerSet(X)) {
                ArrayList<Integer> T = new ArrayList<>();
                T.add(f);
                T.addAll(set);
                P.add(set);
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
