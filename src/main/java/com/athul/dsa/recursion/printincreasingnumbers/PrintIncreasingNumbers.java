package com.athul.dsa.recursion.printincreasingnumbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintIncreasingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scanner.nextInt();
        List<Integer> result = new ArrayList<>();
        increasingNumbers(n, result);
        System.out.println(result);
    }

    private static void increasingNumbers(int n, List<Integer> result) {
        if (n == 0)
            return;
        increasingNumbers(n - 1, result);
        result.add(n);
    }
}
