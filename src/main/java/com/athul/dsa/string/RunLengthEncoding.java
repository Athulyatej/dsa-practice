package com.athul.dsa.string;

import java.util.Scanner;

public class RunLengthEncoding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = scanner.next();
        System.out.println(runLengthEncoding(str));
    }

    private static String runLengthEncoding(String str) {
        String output = "";
        int count;
        for (int i = 0; i < str.length(); i++) {
            count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            output += str.charAt(i);
            output += count;
        }
        if (str.length() < output.length())
            return str;
        return output;
    }
}
