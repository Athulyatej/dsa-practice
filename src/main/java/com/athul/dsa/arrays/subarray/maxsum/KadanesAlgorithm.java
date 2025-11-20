package com.athul.dsa.arrays.subarray.maxsum;

import java.util.Scanner;

public class KadanesAlgorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the no of elements: ");
        int noOfElements = scanner.nextInt();
        int[] arr = new int[noOfElements];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < noOfElements; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(findSubArrayMaxSum(arr));
    }

    private static int findSubArrayMaxSum(int[] arr) {
        int currentSum = 0;
        int maxSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];
            if (currentSum < 0) {
                currentSum = 0;
            }
            maxSum = Math.max(currentSum, maxSum);
        }
        return maxSum;
    }
}
