package com.edhesive.apcs.labs.lab2;

/**
 * Shuffler class (Lab 2: Elevens, Activity 3)
 * NOTE: This class is not part of the elevens application,
 * it is an exercise from the elevens activities
 *
 * This class contains two static methods showing off behavior
 * for array shuffling
 */
public class Shuffler {

    /**
     * This method simulates a perfect shuffle, also known as
     * a "riffle shuffle" where the deck is split in two, and cards
     * from the two sections are placed together in an alternating
     * pattern
     * @param values array of integers to shuffle
     * @return shuffled int array
     */
    public static int[] perfectShuffle(int[] values) {
        int[] shuffled = new int[values.length];
        int k = 0;
        for(int j = 0; j < 26; j++) {
            values[j] = shuffled[k];
            k += 2;
        }
        k = 1;
        for(int j = 26; j < 52; j++) {
            values[j] = shuffled[k];
            k += 2;
        }
        return shuffled;
    }

    /**
     * This method simulates the efficient selection shuffle, where
     * indices are selected at random and swapped with an index that
     * decrements down
     * @param values array of ints to be shuffled. Unlike the perfect
     *               shuffle method, the values are shuffled within
     *               this array instead of being copied over to a new
     *               array.
     */
    public static void efficientSelectionShuffle(int[] values) {
        for(int k = 51; k > 0; k--) {
            int r = (int) (Math.random() * (k + 1));
            // swap values
            int temp = values[k];
            values[k] = values[r];
            values[r] = temp;
        }
    }

}
