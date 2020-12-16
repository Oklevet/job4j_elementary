package ru.job4j.condition;

public class WeekSalary {
    public static int calculate(int[] hours) {
        int sum = 0, n = 1;
        for (int i = 0; i < 7; i++) {
            if (i > 4) {
                n = 2;
            }
            if (hours[i] > 8) {
                sum += 8 * 10 * n;
                sum += (hours[i] - 8) * 15 * n;
            } else {
                sum += hours[i] * 10 * n;
            }
        }
        return sum;
    }
}
