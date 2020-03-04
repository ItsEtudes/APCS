package com.edhesive.apcs.assignments.term2.assn3;

/**
 * Term 2, Assignment 3: Ultimate Frisbee (Person class)
 *
 * This class serves as a simple superclass as a basic Person
 * for other classes such as UltimatePlayer and Captain
 * to extend from. This class simply stores a first and
 * last name, and is able to be represented in String form.
 */
public class Person {

    private String firstName;
    private String lastName;

    /**
     * Constructor for Person. Initializes first and last name
     * of the person
     * @param firstName person's first name
     * @param lastName person's last name
     */
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Returns the Person object in String form
     *
     * @return String in format "[lastName], [firstName]"
     */
    public String toString() {
        return lastName + ", " + firstName;
    }

}
