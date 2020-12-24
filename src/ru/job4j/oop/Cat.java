package ru.job4j.oop;

public class Cat {

    private String food;
    private String nick;

    public void show() {
        System.out.println(this.nick + " ate " + this.food);
    }

    public void eat (String meat) {
        this.food = meat;
    }

    public void getNick(String nick) {
        this.nick = nick;
    }

    public static void main(String[] args) {
        System.out.println("There are gav's food.");
        Cat gav = new Cat();
        gav.eat("kotletka");
        gav.getNick("Gav");
        gav.show();
        Cat black = new Cat();
        black.eat("fish");
        black.getNick("Black");
        black.show();
    }
}
