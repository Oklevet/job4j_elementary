package ru.job4j.poly;

public class Train implements Vehicle {
    @Override
    public String move() {
        return "The train runs on rails.";
    }

    @Override
    public String lightsOn() {
        return "Buffer Lights is on.";
    }
}
