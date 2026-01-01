package com.athul.dsa.bitwise.oddeven;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        System.out.println(evenOrOdd(number));
    }

    private static String evenOrOdd(int number) {
        if ((number & 1) == 1)
            return "Odd";
        else return "Even";
    }
}
