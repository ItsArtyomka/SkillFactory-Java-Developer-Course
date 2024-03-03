package org.artyomka;

public class Main {
    public static void main(String[] args) {
        University university;
        Student student;

        System.out.println(new University("225205", "Moussa Petrov", "Jake", 1954, StudyProfile.ENGINEERING));
        System.out.println(new Student("Artyom Strelok", "206021", 2, 39));
    }
}