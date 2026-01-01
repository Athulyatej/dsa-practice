package com.athul.dsa.bitwise.earthlevels;

public class EarthLevels {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(earthLevel(n));
    }

    private static int convertDecimalToBinary(int n)
    {
        int binaryNumber = 0;
        int remainder, i = 1;

        while (n != 0)
        {
            remainder = n % 2;
            n /= 2;
            binaryNumber += remainder * i;
            i *= 10;
        }
        return binaryNumber;
    }

    private static int earthLevel(int k)
    {
       int binaryNumber, sum = 0;
        binaryNumber = convertDecimalToBinary(k);

        while (binaryNumber != 0)
        {
            int t;
            t = binaryNumber % 2;
            sum = sum + t;
            binaryNumber = binaryNumber / 10;
        }
        return sum;
    }
}
