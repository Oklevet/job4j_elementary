package ru.job4j.oop.singletone;

import ru.job4j.tracker.Item;

public class TrackerSingleSF {
    private static TrackerSingleSF instance;

    private TrackerSingleSF() {
    }

    public static TrackerSingleSF getInstance() {
        if (instance == null) {
            instance = new TrackerSingleSF();
        }
        return instance;
    }

    public Item add(Item model) {
        return model;
    }
}
