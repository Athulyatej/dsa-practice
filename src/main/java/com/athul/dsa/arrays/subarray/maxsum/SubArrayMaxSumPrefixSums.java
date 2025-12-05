package com.athul.dsa.arrays.subarray.maxsum;

import java.util.Scanner;

public class SubArrayMaxSumPrefixSums {
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
        int maxSum = arr[0];
        int currentSum;
        int[] prefixSum = new int[arr.length];
        prefixSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currentSum = prefixSum[j] - prefixSum[i - 1];
                maxSum = Math.max(currentSum, maxSum);
            }
        }
        return maxSum;
    }
}
