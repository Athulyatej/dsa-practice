package com.athul.dsa.bitwise.basic;

public class Bitwise {
    public static void main(String[] args) {
        int a = 5, b = 7, c = 8, d = 0, e = 1;

        //AND
        System.out.println(a + "&" + b + ": " + (a&b));

        //OR
        System.out.println(a + "|" + c + ": " + (a|c));

        //XOR
        System.out.println(a + "^" + b + ": " + (a^b));

        //NOT
        System.out.println("~" + d + ": " + (~d));

        //Left Shift Operator (a << b = a * 2**b)
        System.out.println(a + "<<" + e + ": " + (a<<e));

        //Right Shift Operator (a << b = a / 2**b)
        System.out.println(a + ">>" + e + ": " + (a>>e));
    }
}
