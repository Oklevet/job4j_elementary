package ru.job4j.oop.professions;

public class Dentist extends Doctor {
    private int salary;

    public int getSalary() {
        return salary;
    }

    public String getName(Dentist dentist) {
        return "";
    }

    public String getSurname(Dentist dentist) {
        return "";
    }

    public String getBirthday(Dentist dentist) {
        return "";
    }

    public String getEducation(Dentist dentist) {
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

    public Surgery sewUp(Pacient pacient) {
        return null;
    }

    public Dentist drill(Pacient pacient) {
        return null;
    }
}
