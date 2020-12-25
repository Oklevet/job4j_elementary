package ru.job4j.oop.professions;

public class Engineer extends Profession {

    public Engineer(String name, String surname) {
        super(name, surname);
    }

    public Engineer(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public Graphic draw(Object obl) {
        return null;
    }

    public Engineer workComp(Object obj){
        return null;
    }
}
