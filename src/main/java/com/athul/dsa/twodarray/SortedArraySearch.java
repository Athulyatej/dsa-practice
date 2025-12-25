package com.athul.dsa.twodarray;

import java.util.Arrays;

public class SortedArraySearch {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}
        };
        int value = 33;
        System.out.println(Arrays.toString(search(arr, value)));
    }

    private static int[] search(int[][] arr, int value) {
        int row = 0;
        int col = arr[0].length - 1;
        while(row < arr.length && col >= 0) {
            if (arr[row][col] == value) {
                return new int[] {row, col};
            } else if (arr[row][col] < value) {
                row++;
            } else {
                col--;
            }
        }
        return new int[] {-1, -1};
    }
}
