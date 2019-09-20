package com.edhesive.apcs.lessons.unit2.lesson13;
/*
 * Lesson 13 Coding Activity 5 
 * Create a program to let the user practice their multiplication tables.
 * Print two random integers between 1 and 12 each on a new line. 
 * Then, ask the user to input the multiplication of the two numbers. 
 * If they enter the correct product print "Correct!" otherwise print "Wrong".
 */


import java.util.Scanner;

class Lesson_13_Activity_Five {
    public static void main(String[] args) {
         /*
          * Write your code here
          * Copy and paste your entire program to Code Runner
          * to complete the activity, from the first import statement
          * to the last bracket.
          */
        Scanner scanner = new Scanner(System.in);
        int factorA = (int)((Math.random() * 12) + 1);
        int factorB = (int)((Math.random() * 12) + 1);
        int result = factorA * factorB;
        System.out.println(factorA);
        System.out.println(factorB);
        System.out.println("What's the product?");
        int guess = scanner.nextInt();
        if(guess == result) {
            System.out.println("Correct!");
        } else {
            System.out.println("Wrong");
        }
    }
}