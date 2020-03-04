package com.edhesive.apcs.assignments.term2.assn2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Term 2: Assignment 2 Part 2: FreightTrain
 * This class represents a collection of Boxcars and has various
 * methods to perform operations on all or 1 Boxcar in the train
 * including filling each boxcar, setting 1 boxcar to repair, and
 * setting cargo types of the boxcars to 1 or multiple types
 */
public class FreightTrain {

    private static final List<String> CARGO_TYPES = Arrays.asList("gizmos", "gadgets", "widgets", "wadgets");

    private ArrayList<Boxcar> train;

    /**
     * Default constructor for FreightTrain. This initializes
     * the train with 5 Boxcars each with default values
     */
    public FreightTrain() {
        this(5);
    }

    /**
     * Constructor for FreightTrain. Adds the specified
     * number of boxcars with default values
     *
     * @param nCars number of cars to initialize the train with
     */
    public FreightTrain(int nCars) {
        if(nCars <= 0) {
            nCars = 1;
        }
        train = new ArrayList<>();
        for(int i = 0; i < nCars; i++) {
            train.add(new Boxcar());
        }
    }

    /**
     * Sets the cargo of each boxcar to the input cargo type. If
     * the input cargo type is not valid, each cargo type is set
     * to the default value, "gizmos"
     * @param cargo
     */
    public void setCargo(String cargo) {
        for(Boxcar car : train) {
            car.setCargo(cargo);
        }
    }

    /**
     * This method sets each type of cargo with an alternating
     * pattern: "gizmos", "gadgets", "widgets", "wadgets", "gizmos",
     * "gadgets", "widgets", etc
     */
    public void setMultiCargo() {
        // index of cargo types for iterating through
        int index = 0;
        for(Boxcar car : train) {
            String cargo = CARGO_TYPES.get(index);
            car.setCargo(cargo);
            if(index == CARGO_TYPES.size() - 1) {
                index = 0;
            } else {
                index++;
            }
        }
    }

    /**
     * This method fills the cargo of each boxcar to its maximum
     * capacity
     */
    public void fillTrain() {
        for(Boxcar car : train) {
            while(!car.isFull()) {
                car.loadCargo();
            }
        }
    }

    /**
     * Sets the repair value of the Boxcar at the given index
     * to true
     * @param i index of Boxcar to be set to repair mode
     */
    public void callForRepair(int i) {
        if(i >= 0 && i < train.size()) {
            train.get(i).callForRepair();
        }
    }

    /**
     * Returns the String form of the train, gets the String
     * format of each car and appends a new line character
     * after each
     *
     * @return String formatted train
     */
    public String toString() {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < train.size(); i++) {
            Boxcar car = train.get(i);
            result.append(car.toString());
            result.append("\n");
        }
        return result.toString();
    }

}
