package com.edhesive.apcs.assignments.assn4;

import java.util.Scanner;

/**
 * Assignment 3: String Shortener
 *
 * This program takes in a message, and modifies the message to
 * make it shorter and more efficient assuming the message is
 * 10 or more characters long
 *
 * First, the program converts all characters to lowercase
 * Second, it removes all vowels unless they are needed for the
 * message to make sense
 * Third, it removes any repeated consonants
 *
 * This program also keeps track of the number of removed vowels,
 * repeated consonants, and total characters saved, and it prints
 * those values out at the end along with the shortened message
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the message to be shortened");
        String message = scanner.nextLine();
        System.out.println();
        int removedRepeatedLetters = 0;
        int removedVowels = 0;
        // output message begins empty
        String shortenedMessage = "";
        if(message.length() < 10) {
            System.out.println("This doesn't need shortening!");
        } else {
            message = message.toLowerCase();
            // the message will always have the first character
            shortenedMessage += message.charAt(0);
            int index = 1; // start at index 1 since index 0 doesn't need to be tested
            while(index < message.length()) {
                char ch = message.charAt(index);
                int flag = 1;
                // this if tests to make sure the vowel isn't at the beginning of a word
                if(message.charAt(index - 1) != ' ') {
                    if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                        flag = 0;
                        removedVowels++;
                    }
                }
                // test to see if the character is a repeated vowel
                if(ch == message.charAt(index - 1) && flag == 1) {
                    flag = 0;
                    removedRepeatedLetters++;
                }
                if(flag == 1) {
                    shortenedMessage += ch;
                }
                index++;
            }
            System.out.println("Shortened message: " + shortenedMessage);
            System.out.println("Repeated letters removed: " + removedRepeatedLetters);
            System.out.println("Vowels removed: " + removedVowels);
            System.out.println("Total characters saved: " + (removedRepeatedLetters + removedVowels));
        }
    }

}
