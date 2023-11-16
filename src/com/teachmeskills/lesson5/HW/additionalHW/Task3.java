package com.teachmeskills.lesson5.HW.additionalHW;

import java.util.Arrays;

/**
 * Multiplying two matrices
 * Create two 3x3 arrays of integers (two matrices).
 * Write a program to multiply two matrices.
 * First array: {{1,0,0,0},{0,1,0,0},{0,0,0,0}}
 * Second array: {{1,2,3},{1,1,1},{0,0,0},{2,1,0}}
 * Expected result: 1 2 3 1 1 1 0 0 0
 */
public class Task3 {
    public static void main(String[] args) {
        int[][] array1 = new int[][] {{1,0,0,0},{0,1,0,0},{0,0,0,0}};
        int[][] array2 = new int[][]{{1,2,3},{1,1,1},{0,0,0},{2,1,0}};
        System.out.println("Array1");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Array2");
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("result *");
        int[][] array3 = new int[array1.length][array2[0].length];

        for (int i = 0; i < array3.length; i++) {
            System.out.println();
            for (int j = 0; j < array3[i].length; j++) {
                for (int k = 0; k < array1[0].length; k++) {
                    array3[i][j] += array1[i][k] * array2[k][j];
                }
                System.out.print(array3[i][j] + " ");
            }
        }
    }
}
