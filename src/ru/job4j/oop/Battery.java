package ru.job4j.oop;

public class Battery {
    private int value;

    public Battery(int capacity) {
        this.value = capacity;
    }

    public void exchange(Battery another) {
        another.value += this.value;
        this.value = 0;
    }

    public static void main(String[] args) {
        Battery battery = new Battery(100);
        Battery accum = new Battery(3000);
        System.out.println("battery = " + battery.value + "\n" + "accum = " + accum.value + "\n");
        accum.exchange(battery);
        System.out.println("battery = " + battery.value + "\n" + "accum = " + accum.value);
    }
}
