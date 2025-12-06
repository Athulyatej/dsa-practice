package com.athul.dsa.string.countcharacters;

import java.util.Scanner;

public class CountCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String sentence = scanner.nextLine();
        printCharacterCount(sentence);
    }

    private static void printCharacterCount(String sentence) {
        int alpha = 0, digit = 0, space = 0;
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (ch >= '0' && ch <= '9') digit++;
            else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) alpha++;
            else if (ch == ' ' || ch == '\t') space++;
        }
        System.out.println("Alphabets: " + alpha);
        System.out.println("Digits: " + digit);
        System.out.println("Spaces: " + space);
    }
}
