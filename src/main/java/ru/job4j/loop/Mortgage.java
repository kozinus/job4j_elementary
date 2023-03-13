package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, double salary, double percent) {
        percent = 1 + percent * 0.01;
        int years = 0;
        while (amount > 0) {
            years++;
            amount = amount * percent - salary;
        }
        return years;
    }
}
