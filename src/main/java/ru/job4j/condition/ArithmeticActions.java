package ru.job4j.condition;

public class ArithmeticActions {
    public static String selectAction(int left, int right, int rsl) {
        if (left < rsl) {
            if (rsl - right == left) {
                return "added";
            } else if (rsl / right == left) {
                return "multiplied";
            } else {
                return "none";
            }
        } else {
                if (rsl + right == left) {
                    return "subtracted";
                } else if (rsl * right == left) {
                    return "divided";
                } else {
                    return "none";
                }
        }
    }
}
