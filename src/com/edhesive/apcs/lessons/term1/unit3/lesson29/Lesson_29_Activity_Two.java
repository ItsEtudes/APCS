package com.edhesive.apcs.lessons.term1.unit3.lesson29;
/*
 * Lesson 29 Coding Activity 2
 * Write a loop that processes an array of strings. 
 * Each String should be printed backwards on its own line.
 * 
 * For example, if the list contains:
 *     
 *     {"every", "nearing", "checking", "food", "stand", "value"}
 * 
 * It should output:
 *     yreve
 *     gniraen
 *     gnikcehc
 *     doof
 *     dnats
 *     eulav
 */

class Lesson_29_Activity_Two {
  
    /* Fill this list with values that will be useful for you to test. 
   * A good idea may be to copy/paste the list in the example above. 
   * Do not make any changes to this list in your main method. You can 
   * print values from list, but do not add or remove values to this 
   * variable.  
   */
    public static String [] list = {"every", "nearing", "checking", "food", "stand", "value"};
    
    public static void main(String[] args) {
        /*
         * Write your code here
         * Copy and paste your entire program to Code Runner
         * to complete the activity, from the first import statement
         * to the last bracket.
         */
        for(int i = 0; i < list.length; i++) {
            String word = list[i];
            String reversedWord = "";
            for(int j = word.length() - 1; j >= 0; j--) {
                reversedWord += word.charAt(j);
            }
            System.out.println(reversedWord);
        }
    }
}