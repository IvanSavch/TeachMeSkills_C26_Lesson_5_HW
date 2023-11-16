package com.teachmeskills.lesson5.HW.additionalHW;

import java.util.Arrays;

/**
 * Create a two-dimensional array. Print array diagonals to console
 */
public class Task5 {
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        int a = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = a;
                a++;
            }
        }
        System.out.println(Arrays.deepToString(array));
        System.out.println("----------------------------");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
               if (i == j) {
                   System.out.print(array[i][j]);
               }
            }
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
                    System.out.print(array[i][array.length - 1 - i]);
        }
    }
}
