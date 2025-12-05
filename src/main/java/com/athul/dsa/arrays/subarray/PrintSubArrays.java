package com.athul.dsa.arrays.subarray;

import java.util.Scanner;

public class PrintSubArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the no of elements: ");
        int noOfElements = scanner.nextInt();
        int[] arr = new int[noOfElements];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < noOfElements; i++) {
            arr[i] = scanner.nextInt();
        }
        printSubArrays(arr);
    }

    private static void printSubArrays(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }
}
