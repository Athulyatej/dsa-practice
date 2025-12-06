package com.athul.dsa.string.binarystringtonumber;

import java.util.Scanner;

public class BinaryStringToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the binary string: ");
        String str = scanner.nextLine();
        System.out.println(binaryStringToNumber(str));
    }

    private static int binaryStringToNumber(String str) {
        int base = 1;
        int output = 0;
        for (int i = str.length() - 1; i >=0; i--) {
            if (str.charAt(i) == '1') {
                output += base;
            }
            base *= 2;
        }
        return output;
    }

}
