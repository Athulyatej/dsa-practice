package com.athul.dsa.divideandconquer.binarysearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 7, 8, 9};
        int key = 7;
        System.out.println(binarySearch(arr, 0, arr.length - 1,  key));
    }

    private static int binarySearch(int[] arr, int s, int e, int key) {
        if (s > e)
            return -1;

        int mid = (s + e) / 2;

        if (arr[mid] == key)
            return mid;
        else if (arr[mid] > key)
            return binarySearch(arr, s, mid - 1, key);
        else
            return binarySearch(arr, mid + 1, e, key);
    }
}
