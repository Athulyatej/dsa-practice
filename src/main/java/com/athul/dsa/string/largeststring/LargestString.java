package com.athul.dsa.string.largeststring;

import java.util.Scanner;

public class LargestString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the no of strings you want to input: ");
        int noOfStrings = scanner.nextInt();
        String str;
        int len;
        String largestString = "";
        int maxLength = 0;
        System.out.println("Enter the strings");
        scanner.nextLine();
        for (int i = 0; i < noOfStrings; i++) {
            str = scanner.nextLine();
            len = str.length();
            if (len > maxLength) {
                largestString = str;
                maxLength = len;
            }
        }
        System.out.println("Largest string: " + largestString);
    }
}
