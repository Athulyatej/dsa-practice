package com.athul.dsa.arrays.subarray.maxsum;

import java.util.Scanner;

public class SubArrayMaxSumBruteForce {
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
        int maxSum = 0;
        int currentSum;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currentSum = 0;
                for (int k = i; k <= j; k++) {
                   currentSum += arr[k];
                }
                maxSum = Math.max(currentSum, maxSum);
            }
        }
        return maxSum;
    }
}


