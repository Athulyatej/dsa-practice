package com.athul.dsa.string;

import java.util.Scanner;

public class ShortestPath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the path: ");
        String path = scanner.next();
        printShortestPath(path);
    }

    private static void printShortestPath(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            switch (path.charAt(i)) {
                case 'N':
                    y++;
                    break;
                case 'S':
                    y--;
                    break;
                case 'E':
                    x++;
                    break;
                case 'W':
                    x--;
                    break;
            }
        }
        if (x >= 0 && y >= 0) {
            while (x > 0) {
                System.out.print("E");
                x--;
            }
            while (y > 0) {
                System.out.print("N");
                y--;
            }
        }
        if (x >= 0 && y < 0) {
            while (x > 0) {
                System.out.print("E");
                x--;
            }
            while (y < 0) {
                System.out.print("S");
                y++;
            }
        }
        if (x < 0 && y >= 0) {
            while (x < 0) {
                System.out.print("W");
                x++;
            }
            while (y > 0) {
                System.out.print("N");
                y--;
            }
        }
        if (x < 0 && y < 0) {
            while (x < 0) {
                System.out.print("W");
                x++;
            }
            while (y < 0) {
                System.out.print("S");
                y++;
            }
        }
    }
}
