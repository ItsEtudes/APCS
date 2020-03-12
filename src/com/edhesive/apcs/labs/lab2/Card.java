package com.edhesive.apcs.labs.lab2;

/**
 * Card class (Lab 2: Elevens)
 *
 * This class represents a playing card in a deck. It stores a
 * rank (typically ace through king), a suit, and a point value.
 * Card can be tested for equality and printed in String format
 */
public class Card {

    private String rank;
    private String suit;

    private int pointValue;

    /**
     * Simple constuctor, assigns rank suit and pointValue
     * @param rank rank of card (Ace-King)
     * @param suit suit of card (Hearts, Spades, Diamonds, Clubs)
     * @param pointValue point value of card (1-13) or (2-14),
     *                   depending on aces
     */
    public Card(String rank, String suit, int pointValue) {
        this.rank = rank;
        this.suit = suit;
        this.pointValue = pointValue;
    }

    /**
     * Getter for rank
     * @return card rank
     */
    public String getRank() {
        return rank;
    }

    /**
     * Getter for suit
     * @return card suit
     */
    public String getSuit() {
        return suit;
    }

    /**
     * Getter for pointValue
     * @return card point value
     */
    public int getPointValue() {
        return pointValue;
    }

    /**
     * Method testing equality between card instances.
     * Returns true if tested card has the same rank,
     * suit, and point value
     * @param obj Instance of card to test. If the object is not an
     *            instance of Card, this method returns false
     * @return value showing whether or not the card are equal
     */
    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Card)) {
            return false;
        }
        Card card = (Card) obj;
        return rank.equals(card.rank) && suit.equals(card.suit) && pointValue == card.pointValue;
    }

    /**
     * Returns card in a this String format:
     * [rank] of [suit] (point value = [pointValue])
     * @return Card instance in String form
     */
    @Override
    public String toString() {
        return rank + " of " + suit + " (point value = " + pointValue + ")";
    }
}
