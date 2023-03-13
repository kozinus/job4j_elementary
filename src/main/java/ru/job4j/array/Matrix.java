package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] array = new int[size][size];
        for (int cell = 0; cell < size; cell++) {
            for (int row = 0; row < size; row++) {
                array[cell][row] = (cell + 1) * (row + 1);
            }
        }
        return array;
    }
}
