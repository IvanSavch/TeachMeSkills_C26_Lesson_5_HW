package com.teachmeskills.lesson5.HW;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Create three-dimensional array integers.
 * Using loops, go through the entire array and increase each
 * element for a given number. Let the number that will be
 * increase each element, set from the console.
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = 0;
        int[][][] array = new int[5][5][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] = a;
                    a++;
                }
            }
        }
        System.out.println(Arrays.deepToString(array));

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] *= n;
                }
            }
        }
        System.out.println(Arrays.deepToString(array));
    }
}
