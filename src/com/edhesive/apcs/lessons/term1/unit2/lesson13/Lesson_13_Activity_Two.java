package com.edhesive.apcs.lessons.term1.unit2.lesson13;
/*
 * Lesson 13 Coding Activity 2 
 * Take input of an integer number from the keyboard and print "passing" 
 * if it's greater than or equal to 60, and print "failing" otherwise.
 */


import java.util.Scanner;

class Lesson_13_Activity_Two {
    public static void main(String[] args) {
         /*
          * Write your code here
          * Copy and paste your entire program to Code Runner
          * to complete the activity, from the first import statement
          * to the last bracket.
          */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a test score:");
        int value = scanner.nextInt();
        if(value >= 60) {
            System.out.println("passing");
        } else {
            System.out.println("failing");
        }
    }
}