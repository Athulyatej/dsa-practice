package com.athul.dsa.arrays.search.linearsearch;

import java.util.Scanner;

public class LinearSearch {
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
        int result = linearSearch(arr, key);
        if (result != -1) {
            System.out.println("The element is found at the result: " + result);
        } else {
            System.out.println("The element is not found in the array");
        }
    }

    private static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
      return -1;
    }
}
