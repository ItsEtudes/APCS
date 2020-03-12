# Lab 2: Elevens, Activity Questions

## Activity 1: no questions

## Activity 2:
1. Explain in your own words the relationship beetween a deck and a card.
    - A deck is a collection of cards
2. Consider the deck initialized with the statements below. How many cards does the deck contain?
    ```
   String[] ranks = {"jack", "queen", "king"};
   String[] suits = {"blue", "red"};
   int[] pointValues = {11, 12, 13};
   Deck d = new Deck(ranks, suits, pointValues);
    ```
    - 6 cards; There are 3 possible ranks / point values, and 2 suits. 3 x 2 = 6
3. The game of Twenty-One is played with a deck of 52 cards. Ranks run from ace (highest) down to 2
   (lowest). Suits are spades, hearts, diamonds, and clubs as in many other games. A face card has point
   value 10; an ace has point value 11; point values for 2, …, 10 are 2, …, 10, respectively. Specify the
   contents of the ranks, suits, and pointValues arrays so that the statement
   `Deck d = new Deck(ranks, suits, pointValues);`
   initializes a deck for a Twenty-One game.
    - The array of ranks should begin with "Two" and end with "Ace" since ace is the highest in this case. pointValues should
    run 2 through 14 to line up with "Two" and "Ace". The array of suits should contain "Hearts", "Diamonds", "Spades",
    and "Clubs"
4. Does the order of elements of the `ranks`, `suits`, and `pointValues` arrays matter? 
    - Yes; the values in `ranks` and `pointValues` must line up with each other or else they won't line up when the `Card`
    instances are created.