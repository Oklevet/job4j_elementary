package ru.job4j.poly;

public class Bus implements Transport {
    private int sumPassengers = 0, cost1LFuel = 45;
    @Override
    public void drive() {
        System.out.println("bus driving now");
    }

    @Override
    public void passengers(int number) {
        this.sumPassengers += number;
    }

    @Override
    public int fillUp(int liters) {
        return liters * this.cost1LFuel;
    }
}
