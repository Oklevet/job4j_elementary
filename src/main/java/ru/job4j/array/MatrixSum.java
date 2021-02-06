package ru.job4j.array;

public class MatrixSum {
    public static int sum(int[][] array) {
        int rsl = 0;
        for (int[] ari : array) {
            for (int i : ari) {
                rsl += i;
            }
        }
        return rsl;
    }
}
