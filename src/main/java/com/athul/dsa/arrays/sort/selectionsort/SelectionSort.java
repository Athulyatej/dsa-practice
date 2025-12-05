package com.athul.dsa.arrays.sort.selectionsort;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array you want to input: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr) {
        int currElement;
        int minPos;
        for (int i = 0; i < arr.length - 1; i ++) {
            currElement = arr[i];
            minPos = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[minPos]) {
                    minPos = j;
                }
            }
            arr[i] = arr[minPos];
            arr[minPos] = currElement;
        }
    }
}
