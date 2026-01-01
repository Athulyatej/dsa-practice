package com.athul.dsa.bitwise.replacebits;

public class ReplaceBits {
    public static void main(String[] args) {
        int n = 15;
        int i = 1;
        int j = 3;
        int m = 2;
        System.out.println(replaceBits(n, i, j, m));
    }

    private static int replaceBits(int n, int i, int j, int m) {
        n = clearBits(n, i, j);
        int mask = m << i;
        return n | mask;
    }

    private static int clearBits(int n, int i, int j) {
        int a = -1 << (j+1);
        int b = (1 << i) - 1;
        int mask = a | b;
        return n & mask;
    }
}
