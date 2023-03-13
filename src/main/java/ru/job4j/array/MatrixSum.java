package ru.job4j.array;

public class MatrixSum {
    public static int sum(int[][] array) {
        int rsl = 0;
        for (int cell = 0; cell < array.length; cell++) {
            for (int row = 0; row < array[cell].length; row++) {
                rsl += array[cell][row];
            }
        }
        return rsl;
    }
}