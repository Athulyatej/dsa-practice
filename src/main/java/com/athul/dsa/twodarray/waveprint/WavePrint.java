package com.athul.dsa.twodarray.waveprint;

public class WavePrint {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        printWave(arr);
    }

    private static void printWave(int[][] arr) {
        boolean flag = true;
        int cols = arr[0].length - 1;
        while (cols >= 0) {
            if (flag) {
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i][cols] + " ");
                }
                flag = false;
            } else {
                for (int i = arr.length - 1; i >= 0; i--) {
                    System.out.print(arr[i][cols] + " ");
                }
                flag = true;
            }
            cols--;
        }
    }
}
