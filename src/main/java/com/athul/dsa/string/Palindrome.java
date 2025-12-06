package com.athul.dsa.string;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String word = scanner.nextLine();
        System.out.println(isPalindrome(word));
        System.out.println(isPalindrome1(word));
    }

    private static boolean isPalindrome(String word) {
        int length = word.length() - 1;
        for (int i = 0; i <= length/2; i++) {
            if (word.charAt(i) != word.charAt(length - i))
                return false;
        }
        return true;
    }

    private static boolean isPalindrome1(String word) {
        int length = word.length() - 1;
        int i = 0;
        while (length >= 0) {
            if (word.charAt(i++) != word.charAt(length--))
                return false;
        }
        return true;
    }
}
