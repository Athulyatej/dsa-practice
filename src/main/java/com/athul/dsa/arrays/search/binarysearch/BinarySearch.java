package com.athul.dsa.arrays.search.binarysearch;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array you want to input: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter the element you want to search for in the array: ");
        int key = scanner.nextInt();
        int result = binarySearch(arr, key);
        if (result != -1) {
            System.out.println("The element is found at the result: " + result);
        } else {
            System.out.println("The element is not found in the array");
        }
    }

    private static int binarySearch(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        int mid;
        while (start <= end) {
            mid = (start + end)/2;
            if (key == arr[mid]) {
               return mid;
            } else if (key > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
