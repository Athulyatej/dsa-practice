package com.athul.dsa.recursion.lastoccurrence;

public class LastOccurrence {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 7, 8, 9, 7, 8, 6, 9};
        int key = 7;
        System.out.println(lastOccurrence(arr, 0, arr.length, key));
        System.out.println(lastOccurrenceTwo(arr, 0, arr.length, key));
    }

    private static int lastOccurrence(int[] arr, int i, int length, int key) {
        if (i == length)
            return -1;

        int subIndex = lastOccurrence(arr, i + 1, length, key);

        if (subIndex == -1) {
            if (arr[i] == key)
                return 0;
            else
                return -1;
        } else {
            return subIndex + 1;
        }
    }

    private static int lastOccurrenceTwo(int[] arr, int i, int length, int key) {
        if (i == length)
            return -1;

        int subIndex = lastOccurrenceTwo(arr, i + 1, length, key);

        if (subIndex == -1) {
            if (arr[i] == key)
                return i;
            else
                return -1;
        } else {
            return subIndex;
        }
    }
}
