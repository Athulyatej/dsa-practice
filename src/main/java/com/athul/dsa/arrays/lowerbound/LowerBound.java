package com.athul.dsa.arrays.lowerbound;

import java.util.Scanner;

public class LowerBound {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the no of elements: ");
        int noOfElements = scanner.nextInt();
        int[] arr = new int[noOfElements];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < noOfElements; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter the value: ");
        int value = scanner.nextInt();
        System.out.println(findLowerBound(arr, value));
    }

    private static int findLowerBound(int[] arr, int value) {
        int lowerBound = -1;
        int start = 0;
        int end = arr.length - 1;
        int mid;
        while (start <= end) {
            mid = (start + end)/2;
            if (value >= arr[mid]) {
                lowerBound = arr[mid];
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return lowerBound;
    }
}
