package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int first, int second, int third) {
        int maxOfTwo = max(second, third);
        return first > maxOfTwo ? first : maxOfTwo;
    }

    public static int max(int first, int second, int third, int fourth) {
        int maxOfThree = max(second, third, fourth);
        return first > maxOfThree ? first : maxOfThree;
    }
}
