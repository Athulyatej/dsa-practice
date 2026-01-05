package com.athul.dsa.divideandconquer.twodarraymerge;

import java.util.ArrayList;

public class ArrayMerge2D {

    public static void main(String[] ags) {
        int[][] arr = new int[][]{
                {18, 4, 16, 8},
                {23, 13, 20, 11},
                {28, 24, 26, 25},
                {1, 30, 15, 19}
        };

        int m = arr.length;
        int n = arr[0].length;

        mergeSort(m, n, arr, 0, m - 1, 0, n - 1);
        for (int[] a : arr) {
            for (int x : a) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }

    private static void mergeSort(int m, int n, int[][] mat, int rs, int re, int cs, int ce) {
        if (rs >= re && cs >= ce) {
            return;
        }

        int rm = (rs + re) / 2;
        int cm = (cs + ce) / 2;

        //for dividing into sub arrays
        mergeSort(m, n, mat, rs, rm, cs, cm);
        mergeSort(m, n, mat, rm + 1, re, cs, cm);
        mergeSort(m, n, mat, rs, rm, cm + 1, ce);
        mergeSort(m, n, mat, rm + 1, re, cm + 1, ce);

        //for merging sorted sub arrays
        merge(m, n, mat, rs, rm, re, cs, cm, ce);
    }

    private static void merge(int m, int n, int[][] mat, int rs, int rm, int re, int cs, int cm, int ce) {
        //for sorting rows
        for (int i = rs; i <= re; i++) {
            mergeRow(mat, i, cs, cm, ce);
        }

        //for sorting columns
        for (int j = cs; j <= ce; j++) {
            mergeCol(mat, j, rs, rm, re);
        }
           }

    private static void mergeRow(int[][] mat, int i, int cs, int cm, int ce) {
        ArrayList<Integer> sorted = new ArrayList<>();
        int x = cs;
        int y = cm + 1;

        while (x <= cm && y <= ce) {
            if (mat[i][x] < mat[i][y]) {
                sorted.add(mat[i][x]);
                x++;
            } else {
                sorted.add(mat[i][y]);
                y++;
            }
        }

        while (x <= cm) {
            sorted.add(mat[i][x]);
            x++;
        }

        while (y <= ce) {
            sorted.add(mat[i][y]);
            y++;
        }

        int k = 0;
        for (int j = cs; j <= ce; j++) {
            mat[i][j] = sorted.get(k);
            k++;
        }
    }

    private static void mergeCol(int[][] mat, int j, int rs, int rm, int re) {
        ArrayList<Integer> sorted = new ArrayList<>();
        int x = rs;
        int y = rm + 1;

        while (x <= rm && y <= re) {
            if (mat[x][j] < mat[y][j]) {
                sorted.add(mat[x][j]);
                x++;
            } else {
                sorted.add(mat[y][j]);
                y++;
            }
        }

        while (x <= rm) {
            sorted.add(mat[x][j]);
            x++;
        }

        while (y <= re) {
            sorted.add(mat[y][j]);
            y++;
        }

        int k = 0;
        for (int i = rs; i <= re; i++) {
            mat[i][j] = sorted.get(k);
            k++;
        }
    }
}