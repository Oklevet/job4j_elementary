package ru.job4j.array;

public class ReverseLoopForArray {
    //code from ArrayLoop
    public static void main(String[] args) {
    int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 2 + 3;
        }
        for (int i = 0; i < arr.length; i++) {
            if ((arr.length - 1 - i) % 2 == 0) {
                System.out.println(arr[arr.length - 1 - i]);
            }
        }
    }
}
