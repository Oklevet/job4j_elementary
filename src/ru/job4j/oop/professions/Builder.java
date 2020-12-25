package ru.job4j.oop.professions;

public class Builder {
    private String department;

    public String getDepartment(){
        return department;
    }

    public String getName(Builder builder) {
        return "";
    }

    public String getSurname(Builder builder) {
        return "";
    }

    public String getBirthday(Builder builder) {
        return "";
    }

    public String getEducation(Builder builder) {
        return "";
    }

    public Graphic draw(Object blueprint) {
        return null;
    }

    public Engineer workComp(Object autocad) {
        return null;
    }

    public String scold (Builder builder) {
        return "";
    }
}
