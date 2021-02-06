package ru.job4j.oop.singletone;

import ru.job4j.tracker.Item;

public class TrackerSinglePSFC {
    private TrackerSinglePSFC() {
    }

    public static TrackerSinglePSFC getInstance() {
        return Holder.INSTANCE;
    }

    public Item add(Item model) {
        return model;
    }

    private static final class Holder {
        private static final TrackerSinglePSFC INSTANCE = new TrackerSinglePSFC();
    }

    public static void main(String[] args) {
        TrackerSinglePSFC tracker = TrackerSinglePSFC.getInstance();
    }
}
