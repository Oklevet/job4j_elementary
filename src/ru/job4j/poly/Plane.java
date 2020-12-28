package ru.job4j.poly;

public class Plane implements Vehicle {
    @Override
    public String move() {
        return "The plane flies in the sky and flaps its wings. Oh, doesn't wave.";
    }

    @Override
    public String lightsOn() {
        return "Aircraft Lighting System is on.";
    }
}
