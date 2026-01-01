package com.athul.dsa.bitwise.exponentiation;

public class FastExponentiation {
    public static void main(String[] args) {
        int a = 2;
        int n = 10;
        System.out.println(power(a, n));
    }

    private static int power(int a, int n) {
        int result = 1;
        while (n > 0) {
            if ((n & 1) == 1) {
                result *= a;
            }
            a *= a;
            n = n >> 1;
        }
        return result;
    }
}
