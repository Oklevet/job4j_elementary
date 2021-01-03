package ru.job4j.oop.singletone;

import ru.job4j.tracker.Item;

public enum TrackerSinglEnum {
    INSTANCE; /* здесь мы указываем перечисления. */

    /* Конструкторы и методы. */
    public Item add(Item model) {
        return model;
    }
}
