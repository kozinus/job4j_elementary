package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        System.out.println("Размер массива ages равен = " + ages.length);
        System.out.println("Размер массива surnames равен = " + surnames.length);
        System.out.println("Размер массива prices равен = " + prices.length);
        String[] names = new String[4];
        names[0] = "Kirill Kozin";
        names[1] = "Petr Arsentev";
        names[2] = "Dimitriy Shaban";
        names[3] = "Andrej Gikalov";
        for (int index = 0; index < 4; index++) {
            System.out.println(names[index]);
        }
    }
}
