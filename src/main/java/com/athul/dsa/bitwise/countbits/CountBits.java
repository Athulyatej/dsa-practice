package com.athul.dsa.bitwise.countbits;

public class CountBits {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(countBits(n));
    }

    private static int countBits(int n) {
        int count = 0;
        while (n > 0) {
            count += n & 1;
            n = n >> 1;
        }
        return count;
    }
}
