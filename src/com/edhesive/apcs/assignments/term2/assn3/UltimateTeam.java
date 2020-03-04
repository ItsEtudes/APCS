package com.edhesive.apcs.assignments.term2.assn3;

import java.util.ArrayList;

/**
 * Term 2, Assignment 3: Ultimate Frisbee (UltimateTeam class)
 *
 * This class represents a whole Ultimate Frisbee team, containing
 * a list of coaches, and a list of players. It has methods which
 * format Strings to list the whole team, or specific players from
 * the team.
 */
public class UltimateTeam {

    private ArrayList<UltimatePlayer> players;
    private ArrayList<Coach> coaches;

    /**
     * Constructor for UltimateTeam, initializes list of players, and
     * the list of coaches
     *
     * @param players ArrayList of players in the team
     * @param coaches ArrayList of coaches in the team
     */
    public UltimateTeam(ArrayList<UltimatePlayer> players, ArrayList<Coach> coaches) {
        this.players = players;
        this.coaches = coaches;
    }

    /**
     * Returns a formatted String listing all players with the
     * "cutter" position
     *
     * @return formatted String
     */
    public String getCutters() {
        StringBuilder result = new StringBuilder();
        for(UltimatePlayer player : players) {
            if(player.getPosition().equals("cutter")) {
                result.append(player.toString());
                result.append("\n");
            }
        }
        return result.toString();
    }

    /**
     * Returns a formatted String listing all players with the
     * "handler" position
     *
     * @return formatted String
     */
    public String getHandlers() {
        StringBuilder result = new StringBuilder();
        for(UltimatePlayer player : players) {
            if(player.getPosition().equals("handler")) {
                result.append(player.toString());
                result.append("\n");
            }
        }
        return result.toString();
    }

    /**
     * Returns a multiline formatted string listing all coaches and
     * players in the team
     *
     * @return team formatted String
     */
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("COACHES\n");
        // list coaches
        for(Coach coach : coaches) {
            result.append(coach.toString());
            result.append("\n");
        }
        result.append("\n");
        // list players
        result.append("PLAYERS\n");
        for(UltimatePlayer player : players) {
            result.append(player.toString());
            result.append("\n");
        }
        return result.toString();
    }

}
