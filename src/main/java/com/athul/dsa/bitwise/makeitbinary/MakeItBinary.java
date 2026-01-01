package com.athul.dsa.bitwise.makeitbinary;

public class MakeItBinary {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(toBinary(n));
    }

    private static int toBinary(int n) {
        int result = 0;
        int base = 1;
        while (n > 0) {
            result += (n & 1) * base;
            base *= 10;
            n = n >> 1;
        }
        return result;
    }
}
