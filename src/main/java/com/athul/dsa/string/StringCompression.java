package com.athul.dsa.string;

import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = scanner.next();
        System.out.println(stringCompression(str.toCharArray()));
    }

    private static int stringCompression(char[] chars) {
        int count;
        String output = "";
        for (int i = 0; i < chars.length; i++) {
            count = 1;
            while (i < chars.length - 1 && chars[i] == chars[i + 1]) {
                count++;
                i++;
            }
            output += chars[i];
            if (count > 1)
                output += count;
        }
        chars = new char[output.length()];
        for (int i = 0; i < output.length(); i++) {
            chars[i] = output.charAt(i);
        }
        System.out.println(output);
        return chars.length;
    }
}
