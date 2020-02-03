package com.edhesive.apcs.assignments.term2.assn1;

/**
 * Assignment 2: Fraction
 * This class is meant to represent a basic positive fraction.
 * It stores a numerator and a denominator. It can be represented
 * as a simple fraction string, or as a mixed number. There is also
 * an addition operation.
 */
public class Fraction {
    private int numerator;
    private int denominator;

    /**
     * Default constructor, fraction = 1/1
     */
    public Fraction() {
        numerator = 1;
        denominator = 1;
    }

    /**
     * Normal fraction constructor
     * @param n numerator of the fraction. If not positive, this
     *          is set to 0
     * @param d denominator of the fraction. If not positive, this
     *          is set to 0
     */
    public Fraction(int n, int d) {
        if(n > 0) {
            numerator = n;
        } else {
            numerator = 1;
        }
        if(d > 0) {
            denominator = d;
        } else {
            denominator = 1;
        }
    }

    /**
     * Allows the fraction to be represented as a String (Improper
     * fraction format)
     * @return String version of the fraction: "[numerator]/[denominator]"
     */
    public String toString() {
        return "" + numerator + "/" + denominator;
    }

    /**
     * Same as toString(), but the fraction is represented in
     * mixed number format
     * @return String version of the fraction:
     * "[whole number] [numerator]/denominator]"
     */
    public String mixedNumber() {
        int whole = 0;
        while(numerator >= denominator) {
            numerator -= denominator;
            whole++;
        }
        if(whole == 0) {
            return numerator + "/" + denominator;
        } else if(numerator > 0) {
            return "" + whole + " " + numerator + "/" + denominator;
        }
        return "" + whole;
    }

    /**
     * Adds another fraction to the fraction stored in the class.
     * Both values must be positive
     * @param n numerator of fraction to be added
     * @param d denominator of fraction to be added
     */
    public void add(int n, int d) {
        if(d > 0 && n > 0) {
            numerator = numerator * d + denominator * n;
            denominator = denominator * d;
        }
    }
}