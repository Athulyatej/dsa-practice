package com.athul.dsa.arrays.basic;

import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the no of students: ");
        int noOfStudents = scanner.nextInt();
        int[] marks = new int[noOfStudents];
        System.out.print("Enter the marks of each student: ");
        for (int i = 0; i < noOfStudents; i++) {
            marks[i] = scanner.nextInt();
            marks[i] = marks[i] + 5;
        }
        for (int i = 0; i < noOfStudents; i++) {
            System.out.print(marks[i] + " ");
        }
    }
}
