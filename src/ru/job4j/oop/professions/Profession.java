package ru.job4j.oop.professions;

public class Profession {
    private String name;
    private String surname;
    private String education;
    private String birthday;

    public Profession (String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Profession (String name, String surname, String education, String birthday) {
        this.name = name;
        this.surname = surname;
        this.education = education;
        this.birthday = birthday;
    }

    public String getName(Object obj) {
        return name;
    }

    public String getSurname(Object obj) {
        return surname;
    }

    public String getEducation(Object obj) {
        return education;
    }

    public String getBirthday(Object obj) {
        return birthday;
    }
}
