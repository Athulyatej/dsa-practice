package com.athul.dsa.bitwise.moduloexponentiation;

public class ModuloExponentiation {
    public static void main(String[] args) {
        int x = 12, y = 25, mod = 10007;
        System.out.println(power(x, y, mod));
    }

    private static int power(int x, int y, int p) {
        int res = 1;
        x = x % p;

        if (x == 0) return 0;

        while (y > 0) {
            if ((y & 1) == 1)
                res = (res * x) % p;

            y = y >> 1;
            x = (x * x) % p;
        }
        return res;
    }
}
