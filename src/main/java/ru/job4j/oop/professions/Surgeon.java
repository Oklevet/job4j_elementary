package ru.job4j.oop.professions;

public class Surgeon extends Doctor {
    private String university;

    public Surgeon(String name, String surname) {
        super(name, surname);
    }

    public Surgeon(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public String getUniversity() {
        return university;
    }

    public String getName(Surgeon surgeon) {
        return "";
    }

    public String getSurname(Surgeon surgeon) {
        return "";
    }

    public String getBirthday(Surgeon surgeon) {
        return "";
    }

    public String getEducation(Surgeon surgeon) {
        return "";
    }

    @Override
    public Diagnosis heal(Pacient pacient) {
        return super.heal(pacient);
    }

    @Override
    public Medcard fillIn(String medcardId) {
        return super.fillIn(medcardId);
    }

    public Surgery openUpPacient(Pacient pacient) {         /* like a *****ng tin of baked beans */
        return null;
    }

    public Surgery sewUp(Pacient pacient) {
        return null;
    }
}
