package com.athul.dsa.bitwise.uniqueelement;

public class UniqueElement {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 1, 4, 2, 3};
        System.out.println(findUniqueElement(arr));
    }

    private static int findUniqueElement(int[] arr) {
        int result = 0;
        for (int i : arr)
            result ^= i;
        return result;
    }
}
