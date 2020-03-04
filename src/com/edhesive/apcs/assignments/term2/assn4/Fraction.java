package com.edhesive.apcs.assignments.term2.assn4;

/**
 * Assignment 2: Fraction
 * This class is meant to represent a basic positive fraction.
 * It stores a numerator and a denominator. It can be represented
 * as a simple fraction string, or as a mixed number. There is also
 * an addition operation.
 */
public class Fraction implements Comparable {
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
        simplify();
    }

    /**
     * This method overrides the method in the Comparable interface.
     * It returns a value telling whether or not the given Fraction
     * is greater or smaller than the current instance
     * @param object input fraction
     * @return compare value
     */
    public int compareTo(Object object) {
        Fraction fraction = (Fraction) object;
        double value1 = (double) numerator / denominator;
        double value2 = (double) fraction.numerator / fraction.denominator;
        if(value1 > value2) return 1;
        else if(value2 > value1) return -1;
        else return 0;
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
        simplify();
    }

    /**
     * This method uses the Euclidean algorithm to calculate the gcd
     * of a and b using recursion
     * @param a first factor
     * @param b second factor
     * @return gcd of a and b
     */
    public static int gcd(int a, int b) {
        // b must be greater, so swap them if they're not
        if(a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        int remainder = b % a;
        if(remainder == 0) return a;
        else return gcd(remainder, a);
    }

    /**
     * This method reduces the fraction to simplest terms. It is
     * called in the constructor and in add
     */
    public void simplify() {
        int divisor = gcd(numerator, denominator);
        numerator /= divisor;
        denominator /= divisor;
    }
}