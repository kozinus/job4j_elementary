package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int i = 0;
        int finish = array.length;
        while (i < finish) {
            int j = i + 1;
            while (j < finish) {
                if (array[i] + array[j] == target) {
                    return new int[] {i, j};
                }
                if (array[i] + array[j] > target) {
                    finish = j;
                }
                j++;
            }
            i++;
        }
        return new int[0];
    }
}
