package com.athul.dsa.recursion.powerfunction;

import java.util.Scanner;

public class PowerFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the numbers : ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(power(a, b));
        System.out.println(powerOptimised(a, b));
    }

    private static int power(int a, int b) {
        if (b == 0)
            return 1;
        return a * power(a, b - 1);
    }

    private static int powerOptimised(int a, int b) {
        if (b == 0)
            return 1;
        int subPow = powerOptimised(a, b / 2);
        subPow *= subPow;
        if (b % 2 != 0)
            return 2 * subPow;
        return subPow;
    }
}
