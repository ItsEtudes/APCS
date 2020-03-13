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

## Activity 3:
1. Write a static method named `flip` that simulates a flip of a weighted coin by returning either
"heads" or "tails" each time it is called. The coin is twice as likely to turn up heads as tails.
Thus, `flip` should return "heads" about twice as often as it returns "tails."
    ```
    public static String flip() {
        int value = (int) (Math.random() * 3);
        if(value == 0) return "tails";
        return "heads";
    }
    ```

2. Write a static method named `arePermutations` that, given two `int` arrays of the same length
but with no duplicate elements, returns `true` if one array is a permutation of the other (i.e., the
arrays differ only in how their contents are arranged). Otherwise, it should return `false`.
    ```
    public static boolean arePermutations(int[] arr1, int[] arr2) {
        for(int value : arr1) {
            boolean flag = false;
            for(int i = 0; i < arr2.length; i++) {
                if(arr2[i] == value) flag = true;
            }
            if(!flag) return false;
        }
        return true;
    }
    ```

3. Suppose that the initial contents of the values array in `Shuffler.java` are `{1, 2, 3,
4}`. For what sequence of random integers would the efficient selection shuffle change values to
contain `{4, 3, 2, 1}`?
    - `{0, 1, 1}`; after the first iteration, the array becomes `{4, 2, 3, 1}`. After the second, it becomes
    `{4, 3, 2, 1}`. The last iteration does nothing since it swaps indices `1` and `1`.

## Activity 4: No questions

## Activity 5: No questions

## Activity 6:
1. List all possible plays for the board `5♠ 4♥ 2♦ 6♣ A♠ J♥ K♦ 5♣ 2♠`
    - 5♠ and 6♣, or 5♣ and 6♣
2. If the deck is empty and the board has three cards left, must they be J, Q, and K? Why or why not?
    - Yes; since jacks, queens, and kings cannot be removed as pairs (their values are all 11 or greater), they can only
    be removed as sets of 3. There is also an even number of cards, and cards are only removed in pairs with the only
    exception being face card triple removals. Thus, if there are three cards left, they must be a jack, queen, and king
    because it is the only possible way there can be an odd number of cards left
3. Does the game involve any strategy? That is, when more than one play is possible, does it matter
which one is chosen? Briefly explain your answer.
    - Although different pairs of cards can depend on each other, there is no way of predicting which cards will come 
    next, so there is no strategy involved.