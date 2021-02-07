package ru.job4j.tracker;

public class Item {

    public Item() {
    }

    public Item(String name) {
    }

    public Item(String name, int id) {
    }

    public static void main(String[] args) {
        Item item1 = new Item();
        Item item2 = new Item("qwerty");
        Item item3 = new Item("qwe", 1);
    }
}
