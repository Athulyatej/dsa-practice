package com.athul.dsa.bitwise.countbits;

public class CountBitsEfficient {
    public static void main(String[] args) {
        int n = 15;
        System.out.println(countBits(n));
    }

    private static int countBits(int n) {
        int count = 0;
        while (n > 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
    }
}
