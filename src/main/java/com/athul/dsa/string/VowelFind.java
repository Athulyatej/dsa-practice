package com.athul.dsa.string;

import java.util.Scanner;

public class VowelFind {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = scanner.nextLine();
        System.out.println(findVowels(str));
    }

    private static String findVowels(String str) {
        String output = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                output += str.charAt(i);
            }
        }
        return output;
    }
}
