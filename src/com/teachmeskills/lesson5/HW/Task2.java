package com.teachmeskills.lesson5.HW;

import java.util.Arrays;

/**
 * Create a program to color a chessboard using a loop.
 * Create a two-dimensional 8x8 array of Strings. Using loops to set
 * cycle elements have the values B(Black) or W(White).
 */
public class Task2 {
    public static void main(String[] args) {
        String[][] array = new String[8][8];
        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for (int j = 0; j < array[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    array[i][j] = "W";
                } else array[i][j] = "B";
                System.out.print(array[i][j] + " ");
            }
        }
    }
}

