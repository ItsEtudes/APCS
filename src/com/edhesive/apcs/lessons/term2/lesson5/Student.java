package com.edhesive.apcs.lessons.term2.lesson5;

public class Student {

    private static int prevId = 1;

    private String firstName;
    private String lastName;
    private int gradeLevel;
    private double gpa;
    private int id;

    public Student() {
        this("None", "None", 0, 0.0);
    }

    public Student(String firstName, String lastName, int gradeLevel, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        if(gradeLevel >= 0 && gradeLevel <= 12) {
            this.gradeLevel = gradeLevel;
        } else {
            this.gradeLevel = 0;
        }
        if(gpa >= 0.0 && gpa <= 4.5) {
            this.gpa = gpa;
        } else {
            this.gpa = 0.0;
        }
        id = prevId++;
    }

    public String toString() {
        return lastName + ", " + firstName +
                "\nGPA: " + gpa +
                "\nGrade Level: " + gradeLevel + " id # " + id;
    }
}
