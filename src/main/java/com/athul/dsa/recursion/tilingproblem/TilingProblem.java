package com.athul.dsa.recursion.tilingproblem;

public class TilingProblem {
    public static void main(String[] args) {
        int n = 4;
        int m = 3;
        System.out.println(tiling(n, m));
    }

    private static int tiling(int n, int m) {
        if (n < m)
            return 1;
        return tiling(n - 1, m) + tiling(n - m, m);
    }
}
