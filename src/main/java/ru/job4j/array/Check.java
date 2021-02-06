package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true, curr = data[0];
        for (boolean i : data) {
            if (i != curr) {
                return false;
            }
        }
        return result;
    }
}
