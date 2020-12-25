package ru.job4j.oop.professions;

public class Programmer extends Engineer {
    private int experience;

    public Programmer(String name, String surname) {
        super(name, surname);
    }

    public Programmer(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public int getExperience() {
        return experience;
    }

    public String getName(Programmer programmer) {
        return "";
    }

    public String getSurname(Programmer programmer) {
        return "";
    }

    public String getBirthday(Programmer programmer) {
        return "";
    }

    public String getEducation(Programmer programmer) {
        return "";
    }

    public Graphic draw(Object algorithms) {
        return null;
    }

    public Engineer workComp(Object idea) {
        return null;
    }

    public boolean cryOverCode(Programmer programmer) {
        return true;
    }
}
