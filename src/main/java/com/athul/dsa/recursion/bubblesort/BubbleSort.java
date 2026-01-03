package com.athul.dsa.recursion.bubblesort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 8, 7, 3, 9, -2, -6, -1};
        bubbleSort(arr, arr.length, 0);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr, int n, int j) {
        if (n == 1)
            return;

        if (j == n - 1) {
            bubbleSort(arr, n - 1, 0);
            return;
        }

        if (arr[j] > arr[j + 1]) {
            int temp = arr[j];
            arr[j] = arr[j + 1];
            arr[j + 1] = temp;
        }

        bubbleSort(arr, n, j + 1);
    }
}
