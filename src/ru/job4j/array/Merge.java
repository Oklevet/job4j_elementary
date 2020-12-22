package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int countL = 0, countR = 0;
        int[] rsl = new int[left.length + right.length];
        for (int i = 0; i < rsl.length; i++) {
            if (countL == left.length) {
                rsl[i] = right[countR];
                countR++;
            } else if (countR == right.length) {
                rsl[i] = left[countL];
                countL++;
            } else if (left[countL] < right[countR]) {
                rsl[i] = left[countL];
                countL++;
            } else {
                rsl[i] = right[countR];
                countR++;
            }
        }
        return rsl;
    }
}
