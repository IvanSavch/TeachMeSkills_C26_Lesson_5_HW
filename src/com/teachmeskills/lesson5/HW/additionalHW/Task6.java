package com.teachmeskills.lesson5.HW.additionalHW;

import java.util.Arrays;

/**
 * Create a two-dimensional array of integers. Sort the elements into
 * rows of a two-dimensional array in ascending order.
 */
public class Task6 {
    public static void main(String[] args) {
        int[][] array = new int[][]{{1, 4, 5},
                {1, 7, 2},
                {7, 5, 1}};
        int s;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length - 1; j++) {
                for (int k = 0; k < array[j].length - j - 1; k++) {
                    if (array[i][k] > array[i][k + 1]) {
                        s = array[i][k];
                        array[i][k] = array[i][k + 1];
                        array[i][k + 1] = s;
                    }
                }
            }
        }

        System.out.println(Arrays.deepToString(array));
    }
}
