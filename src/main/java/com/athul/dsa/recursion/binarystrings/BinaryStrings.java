package com.athul.dsa.recursion.binarystrings;

import java.util.ArrayList;
import java.util.List;

public class BinaryStrings {
    public static void main(String[] args) {
        int n = 3;
        List<String> result = new ArrayList<>();
        binaryStrings(n, 0, "", result);
        System.out.println(result);
    }

    private static void binaryStrings(int n, int length, String binStr, List<String> result) {
        if (n == length) {
            result.add(binStr);
            return;
        }

        binaryStrings(n, length + 1, binStr + 0, result);

        if (length > 0 && binStr.charAt(length - 1) == '0')
            binaryStrings(n, length + 1, binStr + 1, result);
        else if (length == 0)
            binaryStrings(n, length + 1, binStr + 1, result);
    }
}
