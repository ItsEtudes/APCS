package com.edhesive.apcs.assignments.term2.assn1;

/* Term 2 Assignment 1 - Fraction */
/* A class which is used to represent fractions*/
public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction() {
        numerator = 1;
        denominator = 1;
    }

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

    public String toString() {
        return "" + numerator + "/" + denominator;
    }

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

    public void add(int n, int d) {
        if(d > 0 && n > 0) {
            numerator = numerator * d + denominator * n;
            denominator = denominator * d;
        }
    }
}