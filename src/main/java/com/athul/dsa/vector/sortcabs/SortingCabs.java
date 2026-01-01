package com.athul.dsa.vector.sortcabs;

import java.util.ArrayList;
import java.util.List;

public class SortingCabs {
    public static void main(String[] args) {
        List<List<Integer>> xys = new ArrayList<>();
        xys.add(List.of(2, 3));
        xys.add(List.of(1, 2));
        xys.add(List.of(3, 4));
        xys.add(List.of(2, 4));
        xys.add(List.of(1, 4));

        System.out.println(xys);

        xys.sort((a, b) ->  Double.compare(distance(a), distance(b)));
//      xys.sort(Comparator.comparingDouble(SortingCabs::distance));

        System.out.println(xys);
    }

    private static double distance(List<Integer> xy) {
        return Math.sqrt((xy.getFirst()*xy.getFirst()) + (xy.getLast()*xy.getLast()));
    }
}
