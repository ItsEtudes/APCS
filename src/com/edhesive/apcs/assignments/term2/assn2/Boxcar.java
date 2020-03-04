package com.edhesive.apcs.assignments.term2.assn2;

import java.util.Arrays;
import java.util.List;

/**
 * Term 2: Assignment 2: Boxcar
 * This class is meant to represent a boxcar in a train. Each instnace
 * has a cargo type (gizmos, gadgets, widgets, or wadgets), number
 * of units (between 0 and 10 inclusive) and a boolean value
 * which determines whether or not the boxcar is in repair.
 * If the boxcar is in repair, it cannot store any units.
 */
public class Boxcar {

    private static final List<String> CARGO_TYPES = Arrays.asList("gizmos", "gadgets", "widgets", "wadgets");
    private static final int MAX_UNITS = 10;

    private String cargo;
    private int numUnits;
    boolean repair;

    /**
     * Default constructor for Boxcar, sets cargo to "gizmos",
     * numUnits is set to 5, repair is set to false
     */
    public Boxcar() {
        this("gizmos", 5, false);
    }

    /**
     * Constructor for Boxcar, allows user to initialize cargo,
     * numUnits, and repair
     *
     * @param cargo type of cargo, must be "gizmos", "gadgets",
     *              "widgets", or "wadgets". Otherwise, it is set
     *              to "gizmos"
     * @param numUnits number of units in the Boxcar, must be between
     *                 0 and 10 inclusive; it is set to 0 otherwise
     * @param repair boolean indicating whether or not the boxcar
     *               is in repair. If the boxcar is in repair,
     *               numUnits is set to 0
     */
    public Boxcar(String cargo, int numUnits, boolean repair) {
        cargo = cargo.toLowerCase();
        // test if cargo is a possible type, set to gizmos otherwise
        if(CARGO_TYPES.contains(cargo)) {
            this.cargo = cargo;
        } else {
            this.cargo = "gizmos";
        }

        // initialize numUnits, set to 0 if not between 0 and 10 inclusive
        if(numUnits >= 0 && numUnits <= 10) {
            this.numUnits = numUnits;
        } else {
            this.numUnits = 0;
        }

        // set numUnits to 0 if boxcar is in repair
        if(repair) this.numUnits = 0;
        this.repair = repair;
    }

    /**
     * This method adds 1 to the number of units in the BoxCar.
     * The maximum capacity of a boxcar is 10 units. If increasing
     * the number of units would go beyond the maximum, keep numUnits
     * at the max capacity. If the repair variable is true, then
     * numUnits may only be set to 0.
     */
    public void loadCargo() {
        if(repair || numUnits == MAX_UNITS) {
            return;
        } else {
            numUnits++;
        }
    }

    /**
     * Getter for the cargo variable
     *
     * @return type of cargo the instance of Boxcar has
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * The cargo variable is set to c only if c is "gizmos",
     * "gadgets", "widgets", or "wadgets", ignoring case. The value
     * stored for cargo should be lowercase. If c holds any value
     * other than  "gizmos", "gadgets", "widgets", or "wadgets"
     * (ignoring case), the method sets the cargo to "gizmos".
     *
     * @param cargo type of cargo to set this instance of Boxcar to
     */
    public void setCargo(String cargo) {
        cargo = cargo.toLowerCase();
        if(CARGO_TYPES.contains(cargo)) {
            this.cargo = cargo;
        } else {
            this.cargo = "gizmos";
        }
    }

    /**
     * Determines whether or not the Boxcar has has the maximum
     * number of units
     *
     * @return boolean value, true if full, false if not
     */
    public boolean isFull() {
        return numUnits == MAX_UNITS;
    }

    /**
     * Sets this instance of Boxcar to be in repair mode.
     * repair is set to true, and numUnits is set to 0
     */
    public void callForRepair() {
        repair = true;
        numUnits = 0;
    }

    /**
     * Returns the string form of the Boxcar in this format:
     * [numUnits] [cargo] (tab) "in [service/repair]"
     * example:
     * 5 gizmos    in repair
     *
     * @return String format of this instance of Boxcar
     */
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(numUnits);
        result.append(" ");
        result.append(cargo);
        result.append("\t");
        String service = null;
        if(repair) {
            service = "in repair";
        } else {
            service = "in service";
        }
        result.append(service);
        return result.toString();
    }

}
