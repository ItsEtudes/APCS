package com.edhesive.apcs.lessons.term1.unit2.lesson13;
/*
 * Lesson 13 Coding Activity 1 
 * Take input of an integer number from the keyboard 
 * and print "Positive" if it's positive or zero, and print "Negative" otherwise.
 */


import java.util.Scanner;

class Lesson_13_Activity_One {
    public static void main(String[] args) {
         /*
          * Write your code here
          * Copy and paste your entire program to Code Runner
          * to complete the activity, from the first import statement
          * to the last bracket.
          */
         Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int value = scanner.nextInt();
        if(value >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }
}