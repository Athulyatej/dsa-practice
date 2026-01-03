package com.athul.dsa.recursion.numberspell;

import java.util.Scanner;

public class NumberSpell {
    private static final String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scanner.nextInt();
        numberSpell(n);
    }

    private static void numberSpell(int n) {
        if (n == 0)
            return;
        int rem = n % 10;
        numberSpell(n / 10);
        System.out.print(arr[rem] + " ");
    }
}
