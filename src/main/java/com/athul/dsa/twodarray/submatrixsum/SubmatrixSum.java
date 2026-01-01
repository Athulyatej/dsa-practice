package com.athul.dsa.twodarray.submatrixsum;

import java.util.Arrays;
import java.util.Scanner;

public class SubmatrixSum {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4, 6},
                {5, 3, 8, 1, 2},
                {4, 6, 7, 5, 5},
                {2, 4, 8, 9, 4}
        };
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the startRow, startCol, endRow and endCol: ");
        int startRow = scanner.nextInt();
        int startCol = scanner.nextInt();
        int endRow = scanner.nextInt();
        int endCol = scanner.nextInt();
        System.out.println(submatrixSum(arr, startRow, startCol, endRow, endCol));
    }

    private static int submatrixSum(int[][] arr, int startRow, int startCol, int endRow, int endCol) {
        int[][] aux = new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (i == 0 && j == 0) {
                    aux[i][j] = arr[i][j];
                } else if (i == 0) {
                    aux[i][j] = arr[i][j] + aux[i][j-1];
                } else if (j == 0) {
                    aux[i][j] = arr[i][j] + aux[i-1][j];
                } else {
                    aux[i][j] = arr[i][j] + aux[i-1][j] + aux[i][j-1] - aux[i-1][j-1];
                }
            }
        }

        for(int[] row: aux) {
            System.out.println(Arrays.toString(row));
        }
        int result = aux[endRow][endCol];
        if (startRow > 0)
            result -= aux[startRow-1][endCol];
        if (startCol > 0)
            result -= aux[endRow][startCol-1];
        if (startRow > 0 && startCol > 0)
            result += aux[startRow-1][startCol-1];
        return  result;
    }
}
