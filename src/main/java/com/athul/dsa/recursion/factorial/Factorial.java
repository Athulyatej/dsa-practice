package com.athul.dsa.recursion.factorial;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scanner.nextInt();
        System.out.println(factorial(n));
    }

    private static int factorial(int n) {
        if (n == 0)
            return 1;
        return n * factorial(n - 1);
    }
}
