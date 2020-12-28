package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        int num = 11, player = 1, n;
        String s1 = "Первый", s2 = "Второй";
        Scanner input = new Scanner(System.in);
        while (num > 0) {
            System.out.println("Оставшееся число спичек: " + num);
            n = Integer.valueOf(input.nextLine());
            if (player % 2 != 0) {
                System.out.println(s1 + " игрок отнимает " + n + " спички.");
            } else {
                System.out.println(s2 + " игрок отнимает " + n + " спички.");
            }
            num -= n;
            player++;
        }
        System.out.print(player % 2 != 0 ? s2 : s1);
        System.out.println(" игрок победил.");
    }
}
