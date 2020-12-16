package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];

        String[] names = new String[4];
        names[0] = "qwe qweeqw";
        names[1] = "asd asdgfd";
        names[2] = "zxc zxczcv";
        names[3] = "qweasd zxcasd";

        System.out.println("Размер массива равен: " + ages.length);
        System.out.println("Размер массива равен: " + surnames.length);
        System.out.println("Размер массива равен: " + prices.length);
        for (String s : names) {
            System.out.println(s);
        }
    }
}
