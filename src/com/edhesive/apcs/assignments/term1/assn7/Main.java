package com.edhesive.apcs.assignments.term1.assn7;

import java.util.Scanner;

/**
 * Assignment 7: Methods Sampler Platter
 *
 * This program contains three methods which can be "sampled" by
 * the user when the program is run.
 *
 * The first method duplicates characters in an input string a certain
 * number of times.
 * The second method tests if a given String is a valid palindrome with
 * a few special cases
 * The third method scrambles a given number with a certain scramble algorithm
 *
 * When run, the user is prompted 3 times so each method can be demonstrated
 */
public class Main {

    /**
     * This method duplicates the characters in the input String n times,
     * if the length of the String is odd, n is the length of the String
     * if the length of the String is even, n is double the String's length
     * @param str Word input to duplicate characters
     * @return String containing the duplicated characters of the input string
     */
    public static String duplicate(String str) {
        int n = -1;
        // if the length of the string is even, n is double the length
        // otherwise it is just the length
        if(str.length() % 2 == 0) {
            n = str.length() * 2;
        } else {
            n = str.length();
        }

        String result = "";
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            for(int j = 0; j < n; j++) {
                result += c;
            }
        }
        return result;
    }

    /**
     * This method tests whether or not the input String is a
     * palindrome, disregarding case. It also allows the following
     * character substitutions:
     * 4 instead of 'a'
     * 3 instead of 'e'
     * 0 instead of 'o'
     * @param str String input to test for palindrome
     * @return whether or not the String is a palindrome
     */
    public static boolean isEdhesivePalindrome(String str) {
        str = str.toLowerCase();
        String correctedStr = "";
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '4') {
                correctedStr += 'a';
            } else if(str.charAt(i) == '3') {
                correctedStr += 'e';
            } else if(str.charAt(i) == '0') {
                correctedStr += 'o';
            } else {
                correctedStr += str.charAt(i);
            }
        }
        String reversedStr = "";
        for(int i = correctedStr.length() - 1; i >= 0; i--) {
            reversedStr += correctedStr.charAt(i);
        }
        return correctedStr.equals(reversedStr);
    }

    /**
     * This method scrambles a double value in the following way:
     * Number gets 5 added to it
     * Number is divided by 2
     * Number is square rooted
     * If the number is less than zero, the method returns 0. This
     * is to avoid any errors with square rooting.
     * @param num number to be scrambled
     * @return scrambled number
     */
    public static double numberScramble(double num) {
        if(num < 0.0) return 0.0;
        num += 5.0;
        num /= 2.0;
        num = Math.sqrt(num);
        return num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Methods Sampler Platter. Please enter a String to duplicate.");
        String strDuplicate = scanner.nextLine();
        System.out.println("The duplicated String is: " + duplicate(strDuplicate));

        System.out.println("Next, please enter a String to check for Edhesive Palindromes.");
        String strPalindrome = scanner.nextLine();
        boolean isPalindrome = isEdhesivePalindrome(strPalindrome);
        if(isPalindrome) {
            System.out.println("Nice, you found an Edhesive Palindrome!");
        } else {
            System.out.println("Too bad, that isn't an Edhesive Palindrome.");
        }
        System.out.println("Almost done! Please enter a number to scramble.");

        double numScramble = scanner.nextDouble();
        System.out.println("The scrambled number is: " + numberScramble(numScramble));
    }

}
