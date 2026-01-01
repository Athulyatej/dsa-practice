package com.athul.dsa.bitwise.flipbit;

public class FlipBit {
    public static void main(String[] args) {
        int n = 10;
        int i = 1;
        System.out.println(flipIthBit(n, i));
    }

    private static int flipIthBit(int n, int i) {
        int mask = 1 << i;
        return n ^ mask;
    }
}
