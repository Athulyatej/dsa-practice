package com.athul.dsa.recursion.printnnumbers;

import java.util.Scanner;

public class PrintNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scanner.nextInt();
        asc(n);
        System.out.println();
        dsc(n);
    }

    private static void asc(int n) {
        if (n == 0)
            return;
        System.out.print(n + " ");
        asc(n - 1);
    }

    private static void dsc(int n) {
        if (n == 0)
            return;
        dsc(n - 1);
        System.out.print(n + " ");
    }
}
