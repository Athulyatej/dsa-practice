package com.athul.dsa.arrays.pairs;

import java.util.Arrays;
import java.util.Scanner;

public class ClosestSum {
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
        System.out.println(Arrays.toString(closestSum(arr, value)));
    }

    private static int[] closestSum(int[] arr, int value) {
        int[] result = new int[2];
        int start = 0;
        int end = arr.length - 1;
        int diff = Integer.MAX_VALUE;
        int sum;
        int curDif;
        while (start < end) {
            sum = arr[start] + arr[end];
            curDif = Math.abs(value - sum);
            if (curDif < diff) {
                diff = curDif;
                result = new int[]{arr[start], arr[end]};
            }
            if (sum < value)
                start ++;
            else end --;
        }
        return result;
    }
}
