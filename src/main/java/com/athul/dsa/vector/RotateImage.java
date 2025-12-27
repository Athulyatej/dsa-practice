package com.athul.dsa.vector;

import java.util.Arrays;

public class RotateImage {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        rotateMatrixBy90Degrees(arr);
        for (int[] row: arr)
            System.out.println(Arrays.toString(row));
    }

    private static void rotateMatrixBy90Degrees(int[][] arr) {
        transposeMatrix(arr);
        reverseRows(arr);
    }

    private static void transposeMatrix(int[][] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr[0].length; j++) {
                swap(arr, i, j, j, i);
            }
        }
    }

    private static void swap(int[][] arr, int row1, int col1, int row2, int col2) {
        int temp = arr[row1][col1];
        arr[row1][col1] = arr[row2][col2];
        arr[row2][col2] = temp;
    }

    private static void reverseRows(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            reverseRow(arr[i]);
        }
    }

    private static void reverseRow(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
