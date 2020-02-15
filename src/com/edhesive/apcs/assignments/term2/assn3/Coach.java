package com.edhesive.apcs.assignments.term2.assn3;

/**
 * Term 2, Assignment 3: Ultimate Frisbee (Coach class)
 *
 * This is a simple class which represents a Coach of an ultimate
 * frisbee team. It stores a first name, a last name, a role, and
 * it can be represented as a string with toString()
 */
public class Coach extends Person {

    private String role;

    /**
     * Constructor for Coach. Initializes first name, last name, and
     * role
     * @param firstName coach's first name
     * @param lastName coach's last name
     * @param role simple description of coach (ex: "Head coach",
     *             "Assistant coach")
     */
    public Coach(String firstName, String lastName, String role) {
        super(firstName, lastName);
        this.role = role;
    }

    /**
     * Returns String form of Coach instance
     *
     * @return Formatted String:
     * "[lastName], [firstName]
     *    Role: [role]"
     */
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(super.toString());
        result.append("\n   Role: ");
        result.append(role);
        return result.toString();
    }

}
