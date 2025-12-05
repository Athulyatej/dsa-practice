package com.athul.dsa.arrays.sort.countingsort;

import java.util.Arrays;
import java.util.Scanner;

public class CountingSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array you want to input: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        countingSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void countingSort(int[] arr) {
        int largest = Integer.MIN_VALUE;
        for (int i : arr) {
            largest = Math.max(largest, i);
        }
        int[] freq = new int[largest + 1];
        for (int i : arr) {
            freq[i]++;
        }
        int k = 0;
        for (int i = 0; i < freq.length; i++) {
            while (freq[i] > 0) {
                arr[k++] = i;
                freq[i]--;
            }
        }
    }
}
