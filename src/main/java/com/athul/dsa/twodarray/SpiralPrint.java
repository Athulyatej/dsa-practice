package com.athul.dsa.twodarray;

public class SpiralPrint {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {12, 13, 14, 5},
                {11, 16, 15, 6},
                {10, 9, 8, 7}
        };
        printSpiral(arr);
    }

    private static void printSpiral(int[][] arr) {
        int startRow = 0;
        int endRow = arr.length - 1;
        int startCol = 0;
        int endCol = arr[0].length - 1;
        while(startRow <= endRow && startCol <= endCol) {

            for (int col = startCol; col <= endCol; col++){
                System.out.print(arr[startRow][col] + " ");
            }

            for (int row = startRow + 1; row <= endRow; row++) {
                System.out.print(arr[row][endCol] + " ");
            }

            for (int col = endCol - 1; col >= startCol; col--){
                if (startRow == endRow) {
                    break;
                }
                System.out.print(arr[endRow][col] + " ");
            }

            for (int row = endRow - 1; row > startRow; row--){
                if (startCol == endCol) {
                    break;
                }
                System.out.print(arr[row][startCol] + " ");
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
    }
}
