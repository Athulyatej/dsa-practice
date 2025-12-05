package com.athul.dsa.arrays.krotate;

import java.util.Arrays;
import java.util.Scanner;

public class KRotateInPlace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array you want to input: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter the value: ");
        int value = scanner.nextInt();
        System.out.println(Arrays.toString(kRotate(arr, value)));
    }

    private static int[] kRotate(int[] arr, int value) {
        int k = value % arr.length;
        reverseArray(arr, 0, arr.length - k);
        reverseArray(arr,  arr.length - k, arr.length);
        reverseArray(arr,  0, arr.length);
        return arr;
    }

    private static void reverseArray(int[] arr, int start, int end) {
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end - 1];
            arr[end - 1] = temp;
            start++;
            end--;
        }
    }
}
