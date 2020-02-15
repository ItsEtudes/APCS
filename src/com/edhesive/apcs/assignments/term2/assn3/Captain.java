package com.edhesive.apcs.assignments.term2.assn3;

public class Captain extends UltimatePlayer {

    private boolean type; // true for offense, false for defense

    /**
     * Constructor for Captain. Initializes first name, last name,
     * position, jersey number, and type of coach
     *
     * @param firstName first name of player
     * @param lastName last name of player
     * @param position position, must be either "handler" or "cutter",
     *                 set to "handler otherwise
     * @param type boolean value, true for offense, false for defense
     */
    public Captain(String firstName, String lastName, String position, boolean type) {
        super(firstName, lastName, position);
        this.type = type;
    }

    /**
     * Returns String form of Captain
     *
     * @return String with the format:
     *   "[lastName], [firstName]
     *   Jersey #: [jerseyNumber]
     *   Position: [position]
     *   Captain: [offense / defense]"
     */
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(super.toString());
        result.append("\n   ");
        result.append("Captain: ");
        result.append(type ? "offense" : "defense");
        return result.toString();
    }

}
