package com.athul.dsa.divideandconquer.rotatedsearch;

public class RotatedSearch {
    public static void main(String[] args) {
        int[] arr = {7, 9, 10, 1, 2, 3, 4, 5, 6};
        int key = 4;
        System.out.println(rotatedSearch(arr, key));
    }

    private static int rotatedSearch(int[] arr, int key) {
        int s = 0;
        int e = arr.length - 1;
        int mid;

        while (s <= e) {
            mid = (s + e) / 2;

            if (arr[mid] == key)
                return mid;

            if (arr[s] <= arr[mid]) {
                if (key >= arr[s] && key <= arr[mid]) {
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }
            } else {
                if (key >= arr[mid] && key <= arr[e]) {
                    s = mid + 1;
                } else {
                    e = mid - 1;
                }
            }
        }
       return -1;
    }
}
