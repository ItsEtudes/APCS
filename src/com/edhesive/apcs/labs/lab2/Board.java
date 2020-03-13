package com.edhesive.apcs.labs.lab2;

import java.util.ArrayList;

public class Board {

    private Deck deck;

    private ArrayList<Card> currentCards;

    private int nCardsToDeal;
    private int pairSum;

    /**
     * Constructor for board. Initializes a standard deck of 52
     * cards, and deals the initial amount of cards onto the
     * table
     * @param nCardsToDeal number of cards on the table at a time.
     *                     This number is 9 for an elevens game
     * @param pairSum total value a valid pair adds up to (ex: 11
     *                for "elevens" game)
     */
    public Board(int nCardsToDeal, int pairSum) {
        this.nCardsToDeal = nCardsToDeal;
        this.pairSum = pairSum;
        this.currentCards = new ArrayList<>();

        String[] ranks = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight",
                "Nine", "Ten", "Jack", "Queen", "King"};
        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        String[] suits = {"Hearts", "Diamonds", "Spades", "Clubs"};

        deck = new Deck(ranks, suits, values);

        for(int i = 0; i < nCardsToDeal; i++) {
            currentCards.add(deck.deal());
        }
    }

    /**
     * This method checks to see if two selected cards add up to
     * the right value
     * @param card1 first card selected
     * @param card2 second card selected
     * @return true if pair is valid, false otherwise
     */
    public boolean isValidPair(Card card1, Card card2) {
        return card1.getPointValue() + card2.getPointValue() == pairSum;
    }

    /**
     * This method replaces any number of cards, but it should
     * only remove 2 or 3 cards at a time after they have been
     * verified as valid pairs / jqk sets
     * @param cards list of cards to replace in the table
     */
    public void replaceCards(Card... cards) {
        for(Card card : cards) {
            int index = currentCards.indexOf(card);
            currentCards.remove(card);
            currentCards.add(index, deck.deal());
        }
    }

    /**
     * This method checks to see if three selected cards are a valid
     * jack + queen + king set
     * @param card1 first selected card
     * @param card2 second selected card
     * @param card3 third selected card
     * @return true if valid jqk set, false otherwise
     */
    public boolean isJQK(Card card1, Card card2, Card card3) {
        ArrayList<String> ranks = new ArrayList<>();
        ranks.add(card1.getRank());
        ranks.add(card2.getRank());
        ranks.add(card3.getRank());
        return ranks.contains("Jack") && ranks.contains("Queen") && ranks.contains("King");
    }

    /**
     * Once the player has decided to stop the game, this method
     * checks to see if the player has won or lost
     * @return true if the game is won, false otherwise
     */
    public boolean isGameWon() {
        return deck.isEmpty() && currentCards.isEmpty();
    }

}
