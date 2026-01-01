package com.athul.dsa.vector.makezeroes;

import java.util.*;

public class MakeZeroes {
    public static void main(String[] args) {
        int[][] arr = {
                {5, 4, 3, 9},
                {2, 0, 7, 6},
                {1, 3, 4, 0},
                {9, 8, 3, 4}
        };
        makeZeroes(arr);
        for (int[] row: arr)
            System.out.println(Arrays.toString(row));
     }

    private static void makeZeroes(int[][] arr) {
        Set<Integer> rows = new HashSet<>();
        Set<Integer> cols = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 0) {
                    rows.add(i);
                    cols.add(j);
                }
            }
        }

        for (int i : rows) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = 0;
            }
        }

        for (int j : cols) {
            for (int i = 0; i < arr.length; i++) {
                arr[i][j] = 0;
            }
        }
    }
}
