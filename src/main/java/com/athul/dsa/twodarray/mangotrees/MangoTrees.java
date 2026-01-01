package com.athul.dsa.twodarray.mangotrees;

import java.util.Arrays;

public class MangoTrees {
    public static void main(String[] args) {
        int[][] arr = {
                {0, 1, 1, 0, 0, 0},
                {1, 0, 0, 1, 1, 0},
                {0, 1, 0, 0, 0, 0},
                {0, 1, 1, 0, 0, 1},
                {1, 0, 0, 1, 1, 0},
                {0, 1, 0, 0, 0, 0}
        };
        System.out.println(mangoTrees(arr));
    }

    private static int mangoTrees(int[][] arr) {
        int max = 0;
        int[][] aux = new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (i == 0 && j == 0) {
                    aux[i][j] = arr[i][j];
                } else if (i == 0) {
                    aux[i][j] = arr[i][j] + aux[i][j - 1];
                } else if (j == 0) {
                    aux[i][j] = arr[i][j] + aux[i - 1][j];
                } else {
                    aux[i][j] = arr[i][j] + aux[i - 1][j] + aux[i][j - 1] - aux[i - 1][j - 1];
                }
            }
        }

        for (int[] row : aux) {
            System.out.println(Arrays.toString(row));
        }

        int qtr1, qtr2, qtr3, qtr4, min;
        for (int i = 0; i < aux.length; i++) {
            for (int j = 0; j < aux[0].length; j++) {
                qtr1 = aux[i][j];
                qtr2 = aux[i][aux[0].length-1] - aux[i][j];
                qtr3 = aux[arr.length-1][j] - aux[i][j];
                qtr4 = aux[arr.length-1][arr[0].length-1] - qtr1 - qtr2 - qtr3;
                min = Math.min(Math.min(qtr1, qtr2), Math.min(qtr3, qtr4));
                max = Math.max(max, min);
            }
        }
        return max;
    }
}
