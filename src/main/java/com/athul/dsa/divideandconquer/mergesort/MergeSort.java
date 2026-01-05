package com.athul.dsa.divideandconquer.mergesort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {8, 5, 7, 3, 12, 11};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr, int s, int e) {
        if (s >= e)
            return;

        int mid = (s + e) / 2;
        mergeSort(arr, s, mid);
        mergeSort(arr, mid + 1, e);
        merge(arr, s, e);
    }

    private static void merge(int[] arr, int s, int e){
        int i = s;
        int mid = (s + e) / 2;
        int j = mid + 1;
        int[] temp = new int[e - s + 1];
        int k = 0;

        while (i <= mid && j <= e) {
            if (arr[i] < arr[j])
                temp[k++] = arr[i++];
            else
                temp[k++] = arr[j++];
        }

        while (i <= mid)
            temp[k++] = arr[i++];

        while (j <= e)
            temp[k++] = arr[j++];

        k = 0;
        for (int idx = s; idx <= e; idx++)
            arr[idx] = temp[k++];
    }
}
