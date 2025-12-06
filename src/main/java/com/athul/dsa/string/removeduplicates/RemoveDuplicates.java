package com.athul.dsa.string.removeduplicates;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = scanner.nextLine();
        System.out.println(removeDuplicates(str));
    }

    private static String removeDuplicates(String str) {
        String output = "";
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }
        for (Character ch : set) {
            output += ch;
        }
        return output;
    }
}
