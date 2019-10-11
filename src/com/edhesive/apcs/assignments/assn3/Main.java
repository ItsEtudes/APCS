package com.edhesive.apcs.assignments.assn3;

import java.util.Scanner;

/**
 * This program is a "Crack the Code!" game (of sort) which prompts
 * the user to enter three integer values
 *
 * Phase 1: the number must be equal to 3
 * Phase 2: the number must be between 33 and 100 inclusive
 * Phase 3: the number must be positive and divisible by either 7 or 3
 *
 * If all 3 phases are successfully passed, the player has
 * successfully cracked the code
 * If any phase of the game is failed, the program ends
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome. What is your name?");
        String name = scanner.nextLine();
        System.out.println("Hello " + name + ". Try your best to crack the code!\n");
        // flag value which gets set to 0 if any tests are failed
        int flag = 1;
        System.out.println("PHASE 1");
        System.out.println("Enter a number:");
        int firstValue = scanner.nextInt();
        if(firstValue == 3) {
            System.out.println("Correct!\n");
        } else {
            System.out.println("Sorry, that was incorrect!");
            flag = 0;
        }
        if(flag == 1) {
            System.out.println("PHASE 2");
            System.out.println("Enter a number:");
            int secondValue = scanner.nextInt();
            if(secondValue == 1 || (secondValue >= 33 && secondValue <= 100)) {
                System.out.println("Correct!\n");
            } else {
                System.out.println("Sorry, that was incorrect!");
                flag = 0;
            }
        }
        if(flag == 1) {
            System.out.println("PHASE 3");
            System.out.println("Enter a number:");
            int thirdValue = scanner.nextInt();
            if(thirdValue > 0 && (thirdValue % 3 == 0 || thirdValue % 7 == 0)) {
                System.out.println("Correct!");
            } else {
                System.out.println("Sorry, that was incorrect!");
                flag = 0;
            }
        }
        if(flag == 1) {
            System.out.println("You have cracked the code!");
        } else {
            System.out.println("Better luck next time!");
        }
    }

}
