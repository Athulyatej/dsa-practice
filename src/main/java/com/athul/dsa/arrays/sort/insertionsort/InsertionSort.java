package com.athul.dsa.arrays.sort.insertionsort;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array you want to input: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr) {
        int currElement;
        int prev;
        for (int i = 0; i < arr.length; i++) {
            currElement = arr[i];
            prev = i - 1;
            while (prev >= 0 && arr[prev] > currElement) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = currElement;
        }
    }

}
