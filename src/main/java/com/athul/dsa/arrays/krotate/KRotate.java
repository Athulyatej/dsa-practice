package com.athul.dsa.arrays.krotate;

import java.util.Arrays;
import java.util.Scanner;

public class KRotate {
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
        int[] result = new int[arr.length];
        int s = 0;
        for (int i = arr.length - k; i < arr.length; i++) {
            result[s++] = arr[i];
        }
        for (int i = 0; i < arr.length - k; i++) {
            result[s++] = arr[i];
        }
        return result;
    }
}
