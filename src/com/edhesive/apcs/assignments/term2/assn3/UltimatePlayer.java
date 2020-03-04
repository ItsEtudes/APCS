package com.edhesive.apcs.assignments.term2.assn3;

import java.util.Arrays;
import java.util.List;

/**
 * Term 2, Assignment 3: Ultimate Frisbee (UltimatePlayer class)
 *
 * This class represents an UltimateFrisbee player. It extends from
 * the Person class to store his or her first and last name. This
 * class additionally stores a position (handler or cutter) and a
 * jersey number
 */
public class UltimatePlayer extends Person {

    private static final List<String> POSITION_NAMES = Arrays.asList("handler", "cutter");

    private static int jerseyCounter = 1;

    private int jerseyNumber;
    private String position;

    /**
     * Constructor for player. Initializes first and last name,
     * position, and jersey number.
     *
     * @param firstName Player's first name
     * @param lastName Player's last name
     * @param position Player's position, must be either "handler"
     *                 or "cutter", set to "handler" otherwise
     */
    public UltimatePlayer(String firstName, String lastName, String position) {
        super(firstName, lastName);
        // set jerseyNumber and increment counter for next player
        jerseyNumber = jerseyCounter;
        jerseyCounter++;

        // if name is not a valid name, set to the default: "handler"
        position = position.toLowerCase();
        if(POSITION_NAMES.contains(position)) {
            this.position = position;
        } else {
            this.position = POSITION_NAMES.get(0);
        }
    }

    /**
     * Getter for position
     * @return position of player
     */
    public String getPosition() {
        return position;
    }

    /**
     * Creates String form of ultimate player including his or her
     * first and last name, jersey number, and position
     *
     * @return String with the format:
     * "[lastName], [firstName]
     *    Jersey #: [jerseyNumber]
     *    Position: [position]"
     */
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(super.toString());
        result.append("\n   ");
        result.append("Jersey #: ");
        result.append(jerseyNumber);
        result.append("\n   ");
        result.append("Position: ");
        result.append(position);
        return result.toString();
    }

}
