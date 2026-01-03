package com.athul.dsa.recursion.firstoccurrence;

public class FirstOccurrence {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 7, 8, 9, 7};
        int key = 7;
        System.out.println(firstOccurrence(arr, 0, arr.length, key));
        System.out.println(firstOccurrenceTwo(arr, 0, arr.length, key));
    }

    private static int firstOccurrence(int[] arr, int i, int length, int key) {
        if (i == length)
            return -1;

        if (arr[i] == key)
            return 0;

        int subIndex = firstOccurrence(arr, i + 1, length, key);

        if (subIndex != -1)
            return subIndex + 1;
        else
            return -1;
    }

    private static int firstOccurrenceTwo(int[] arr, int i, int length, int key) {
        if (i == length)
            return -1;

        if (arr[i] == key)
            return i;

        return firstOccurrenceTwo(arr, i + 1, length, key);

    }
}
