package ru.job4j.ex;

public class FindMaxLength {
    public static void main(String[] args) {
        String[] shops = {"Ebay", null, "Amazon", null, "Ozon"};
        int max = 0;
        for (String s : shops) {
            if(s != null) {
                if (s.length() > max) {
                    max = s.length();
                }
            }
        }
        System.out.println("Max length : " + max);
    }
}
