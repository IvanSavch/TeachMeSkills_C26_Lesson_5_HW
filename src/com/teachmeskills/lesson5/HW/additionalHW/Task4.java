package com.teachmeskills.lesson5.HW.additionalHW;

import java.util.Arrays;

/**
 * Create a two-dimensional array of integers. Print the amount to the console
 * all elements of the array.
 */
public class Task4 {
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = i + 1;
                sum += array[i][j];
            }
        }
        System.out.println(Arrays.deepToString(array));
        System.out.println("Sum: " + sum);
    }
}
