package com.edhesive.apcs.assignments.term2.assn5;

import java.util.*;
import java.lang.*;

/**
 * Term 2 Assignment 5 - Game Wheel
 * GameWheel class
 */
public class GameWheel
{
    // List of slices making up the wheel
    private List<Slice> slices;

    // Position of currently selected slice on wheel
    private int currentPos;


    /**
     * Creates a wheel with 40 preset slices which are then randomized (keeping
     * the color pattern the same).
     */
    public GameWheel() {
        slices = new ArrayList<>();
        currentPos = 0;
        initGameWheel();
        scramble();
    }


    /**
     * Spins the wheel by so that a different slice is selected. Return that
     * slice (Note: the 20 slices following the current slice are more likely to
     * be returned than the other 20).
     */
    public Slice spinWheel() {
        //spin power between range of 1-100 (inclusive)
        int power = (int)(Math.random()*100 + 1);
        int newPos = (currentPos + power) % slices.size();
        currentPos = newPos;
        return slices.get(currentPos);
    }


    /**
     * Helper method for the constructor. Randomizes the positions of the slices
     * that are in the wheel, but without changing the pattern of the colors
     * (i.e. the red slices will still be at odd indices, the black slices at
     * multiples of 10, and the blue slices at all other even indices).
     */
    private void scramble() {
        for(int i = slices.size() - 1; i > 0; i--) {
            // random index earlier in the loop to swap positions with
            int r = (int) (Math.random() * (i + 1));
            // makes random number same type as index (i.e. even, odd, divisible by 10)
            if(i % 2 == 1) {
                r -= (r % 2) - 1;
            } else if(i % 10 == 0) {
                r -= (r % 10);
            } else {
                while(r % 10 == 0 || r % 2 == 1) {
                    r = (int) (Math.random() * (i + 1));
                }
            }
            Slice temp = slices.get(i);
            slices.set(i, slices.get(r));
            slices.set(r, temp);
        }
    }


    /**
     * Helper method which initializes the slices in the wheel
     */
    private void initGameWheel() {
        slices.add(new Slice("black", 8000));
        for (int i=1; i < 40; i++)
        {
            if (i%2 == 1)
                slices.add(new Slice("red", i*10));
            else if (i%10 == 0)
                slices.add(new Slice("black", i*200));
            else
                slices.add(new Slice("blue", i*100));
        }
    }


    /**
     * Returns the list of slices for this GameWheel
     */
    public List<Slice> getSlices() {
        return slices;
    }
}
