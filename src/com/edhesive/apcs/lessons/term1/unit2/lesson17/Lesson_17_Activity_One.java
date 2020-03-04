package com.edhesive.apcs.lessons.term1.unit2.lesson17;
/*
 * Lesson 17 Coding Activity 1
 * Write a program that will input a list of test scores in from the keyboard. 
 * When the user enters -1, print the average.
 * 
 * What do you need to be careful about when using -1 to stop a loop?
 * 
 *     Sample Run:
 *         Enter the Scores:
 *         45
 *         100
 *         -1
 *
 *         The average is: 72.5
 * 
 * 
 */ 

import java.util.Scanner;

class Lesson_17_Activity_One {
    public static void main(String[] args) {
        /*
         * Write your code here
         * Copy and paste your entire program to Code Runner
         * to complete the activity, from the first import statement
         * to the last bracket.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the scores:");
        int total = 0;
        int n = 0;
        int c = 0;
        while(n != -1) {
            n = scanner.nextInt();
            total += n;
            c++;
        }
        total++;
        c--;
        double average = (double) total / c;
        System.out.println("\nThe average is: " + average);
    }
}