package ru.job4j.oop.professions;

public class Doctor extends Profession{

    public Doctor(String name, String surname) {
        super(name, surname);
    }

    public Doctor(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public Diagnosis heal(Pacient pacient) {
        return null;
    }
    public Medcard fillIn(String medcardId) {
        return null;
    }
}
