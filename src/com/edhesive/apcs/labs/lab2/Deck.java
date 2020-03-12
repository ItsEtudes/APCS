package com.edhesive.apcs.labs.lab2;

import java.util.ArrayList;

/**
 * Deck class (Lab 2: Elevens)
 *
 * This class represents a deck of cards. Card class instances are
 * stored in an ArrayList and can be dealt and shuffled. The deck can
 * also be tested for emptiness, and can determine the size (number
 * of cards not yet dealt)
 */
public class Deck {

    private ArrayList<Card> cards;
    private int size;

    /**
     * Constructor for Deck class. This initializes the ArrayList of
     * cards by iterating through the given arrays of ranks,
     * suits, and values. If ranks and values do not have the same
     * length, card data may be lost
     * @param ranks array of card ranks
     * @param suits array of card suits
     * @param values array of card values
     */
    public Deck(String[] ranks, String[] suits, int[] values) {
        cards = new ArrayList<>();
        // take whichever array has the smaller length to avoid an ArrayIndexOutOfBoundsException
        int maxValues = Math.min(ranks.length, values.length);
        for(int i = 0; i < maxValues; i++) {
            for(String suit : suits) {
                cards.add(new Card(ranks[i], suit, values[i]));
            }
        }
        size = cards.size();
        shuffle();
    }

    /**
     * This method deals a card from the top of the deck
     * (aka the end of the list). Cards are not removed from the list
     * so dealt cards can easily be reshuffled back in later, but size
     * is modified here
     * @return card at the end of the cards list
     */
    public Card deal() {
        if(isEmpty()) return null;
        size--;
        return cards.get(size);
    }

    /**
     * Getter for size of deck
     * @return deck size
     */
    public int size() {
        return size;
    }

    /**
     * Tests if deck is empty
     * @return true if size is 0, false otherwise
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * TODO: implement shuffle method (Activity 4)
     */
    public void shuffle() {

    }

}
