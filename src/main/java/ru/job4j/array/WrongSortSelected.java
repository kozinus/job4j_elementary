package ru.job4j.array;

public class WrongSortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int index = FindLoop.indexInRange(data, min, i,  data.length - 1);
            int[] sorted = SwitchArray.swap(data, data[index], data[i]);
        }
        return data;
    }
}