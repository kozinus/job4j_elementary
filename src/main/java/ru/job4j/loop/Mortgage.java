package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, double salary, double percent) {
        percent = 1 + percent * 0.01;
        int years = 1;
        while ((amount * percent - salary) > 0.0) {
            years++;
            amount = amount * percent - salary;
        }
        return years;
    }
}
