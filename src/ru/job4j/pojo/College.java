package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setAdmission("01.09.2020");
        student.setFio("Qwe Qwerty Asd");
        student.setGroup("M-RE-104");
        System.out.println(student.getFio() + " studies in college from " + student.getAdmission() + " in group " + student.getGroup());
    }
}
