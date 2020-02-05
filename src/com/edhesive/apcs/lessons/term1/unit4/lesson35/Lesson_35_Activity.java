package com.edhesive.apcs.lessons.term1.unit4.lesson35;
/*
 * Lesson 35 Coding Activity
 * 
 * Write four overloaded methods called randomize. Each method will
 * return a random number based on the parameters that it receives:
 * 
 * Write four overloaded methods called randomize. 
 * Each method will return a random number based on the parameters that it receives:
 * randomize() - Returns a random int between min and max inclusive. Must have two int parameters. 
 * randomize() - Returns a random int between 0 and max inclusive. Must have one int parameter. 
 * randomize() - Returns a random double between min and max inclusive. Must have two double parameters. 
 * randomize() - Returns a random double between 0 and max inclusive. Must have one double parameter. 
 * 
 * Because these methods are overloaded, they should be declared in the same class. 
 * To simulate this, copy all four methods into the single Code Runner box.
 */


class Lesson_35_Activity {

    public static int randomize(int min, int max) {
        return (int) (Math.random() * (max - min)) + min;
    }

    public static int randomize(int max) {
        return (int) (Math.random() * (max));
    }

    public static double randomize(double min, double max) {
        return (Math.random() * (max - min)) + min;
    }

    public static double randomize(double max) {
        return Math.random() * max;
    }

}