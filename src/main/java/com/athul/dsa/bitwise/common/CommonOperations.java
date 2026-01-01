package com.athul.dsa.bitwise.common;

public class CommonOperations {
    public static void main(String[] args) {
        int n = 5;
        int i = 1;
        int v = 1;
        int n1 = 31;
        int j = 3;
        System.out.println("Get Ith Bit " + getIthBit(n, i));
        System.out.println("Set Ith Bit " + setIthBit(n, i));
        System.out.println("Clear Ith Bit " + clearIthBit(n, i));
        System.out.println("Update Ith Bit " + updateIthBit(n, i, v));
        System.out.println("Clear Last I Bits " + clearLastIBits(n, i));
        System.out.println("Clear Bits In Range " + clearBitsInRange(n1, i, j));
    }

    private static int getIthBit(int n, int i) {
        int mask = 1 << i;
        return (n & mask) > 0 ? 1 : 0;
    }

    private static int setIthBit(int n, int i) {
        int mask = 1 << i;
        return n | mask;
    }

    private static int clearIthBit(int n, int i) {
        int mask = ~(1 << i);
        return n & mask;
    }

    private static int updateIthBit(int n, int i, int v) {
        n = clearIthBit(n, i);
        int mask = v << i;
        return n | mask;
    }

    private static int clearLastIBits(int n, int i) {
        int mask = -1 << i;
        return n & mask;
    }

    private static int clearBitsInRange(int n, int i, int j) {
        int a = -1 << (j + 1);
        int b = (1 << i) - 1;
        int mask = a | b;
        return n & mask;
    }
}
