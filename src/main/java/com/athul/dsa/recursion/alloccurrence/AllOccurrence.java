package com.athul.dsa.recursion.alloccurrence;

import java.util.ArrayList;
import java.util.List;

public class AllOccurrence {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 7, 8, 9, 7, 8, 6, 9, 7};
        int key = 7;
        List<Integer> result = new ArrayList<>();
        allOccurrence(arr, 0, arr.length, key, result);
        System.out.println(result);
    }

    private static void allOccurrence(int[] arr, int i, int length, int key, List<Integer> result) {
        if (i == length)
            return;

        if (arr[i] == key)
            result.add(i);

        allOccurrence(arr, i + 1, length, key, result);
    }
}
