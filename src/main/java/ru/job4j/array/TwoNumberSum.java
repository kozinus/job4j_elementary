package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int i = 0;
        int finish = 0;
        while (i < array.length - finish) {
            int j = i + 1;
            while (j < array.length - finish) {
                if (array[i] + array[j] == target) {
                    return new int[] {i, j};
                }
                if (array[i] + array[j] > target) {
                    finish++;
                }
                j++;
            }
            i++;
        }
        return new int[0];
    }
}
