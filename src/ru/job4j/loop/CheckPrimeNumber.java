package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        if (number == 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % 2 == 0) {
                prime = false;
                break;
                //return false;   //  just okay
            }
        }
        return prime;
    }
}
