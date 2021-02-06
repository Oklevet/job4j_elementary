package ru.job4j.poly;

public class Car implements Vehicle {
    @Override
    public String move() {
        return "The car drives on the roads.";
    }

    @Override
    public String lightsOn() {
        return "Headlights is on.";
    }
}
