package com.edhesive.apcs.lessons.term1.unit3.lesson23;
/*
 * Lesson 24 Coding Activity 1
 * Use a for loop to print all of the numbers from 23 to 89, with 10 numbers on each line. 
 * Print one space between each number.
 */

class Lesson_24_Activity_One {
    public static void main(String[] args) {
        /*
         * Write your code here
         * Copy and paste your entire program to Code Runner
         * to complete the activity, from the first import statement
         * to the last bracket.
         */
        for(int i = 23; i < 90; i++) {
            System.out.print(i + " ");
            if((i - 22) % 10 == 0) {
                System.out.println();
            }
        }
    }
}