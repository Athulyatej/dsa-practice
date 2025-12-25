package com.athul.dsa.twodarray;

import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        printPascalsTriangle(rows);
    }

    private static void printPascalsTriangle(int rows) {
        int[][] triangle = new int[rows][];

        for (int n = 0; n < rows; n++) {
            triangle[n] = new int[n + 1];

            triangle[n][0] = 1;
            triangle[n][n] = 1;

            for (int k = 1; k < n; k++) {
                triangle[n][k] = triangle[n - 1][k - 1] + triangle[n - 1][k];
            }
        }

        for (int n = 0; n < rows; n++) {
            for (int space = 0; space < rows - n; space++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= n; k++) {
                System.out.print(triangle[n][k] + " ");
            }
            System.out.println();
        }
    }
}
