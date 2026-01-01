package com.athul.dsa.bitwise.poweroftwo;

public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 1024;
        System.out.println(isPowerOfTwo(n));
    }

    private static boolean isPowerOfTwo(int n) {
        return (n & (n - 1)) == 0;
    }
}
