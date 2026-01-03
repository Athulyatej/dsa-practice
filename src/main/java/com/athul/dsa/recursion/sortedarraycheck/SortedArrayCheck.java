package com.athul.dsa.recursion.sortedarraycheck;

public class SortedArrayCheck {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(isSorted(arr, 0, arr.length));
    }

    private static boolean isSorted(int[] arr, int i, int length) {
        if (i == length - 1)
            return true;
        return arr[i] < arr[i + 1] && isSorted(arr, i + 1, length);
    }
}
