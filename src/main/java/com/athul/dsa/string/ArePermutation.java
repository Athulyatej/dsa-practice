package com.athul.dsa.string;

import java.util.Arrays;
import java.util.Scanner;

public class ArePermutation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String word1 = scanner.next();
        System.out.print("Enter the second string: ");
        String word2 = scanner.next();
        System.out.println(arePermutation(word1, word2));
    }

    private static boolean arePermutation(String word1, String word2) {
        if (word1.length() != word2.length())
            return false;
        char[] str1 = word1.toCharArray();
        char[] str2 = word2.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        for (int i = 0; i < str1.length; i++) {
            if (str1[i] != str2[i]) {
                return false;
            }
        }
        return true;
    }
}
