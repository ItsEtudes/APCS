package com.edhesive.apcs.lessons.term1.unit2.lesson12;
/*
 * Lesson 12 Coding Activity 2 
 * Input two decimal numbers and print the largest.
 * If the numbers are equal, print one of them.
 *     
 *     Sample Run 1
 *        Please enter two numbers:
 *        45.7
 *        45.1
 *
 *        Largest is: 45.7 
 *         
 *      Sample Run 2
 *        Please enter two numbers:
 *        14
 *        14
 * 
 *        Largest is: 14.0          
 * 
 */


import java.util.Scanner;

class Lesson_12_Activity_Two {
    public static void main(String[] args) {
         /*
          * Write your code here
          * Copy and paste your entire program to Code Runner
          * to complete the activity, from the first import statement
          * to the last bracket.
          */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter two numbers:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        // Test if a is greater than b, and if they are equal, also print a
        if(a >= b) {
            System.out.println("Largest is: " + a);
        }
        // Equal operator not needed here because the above if statement already tested for it
        if(a < b) {
            System.out.println("Largest is: " + b);
        }
    }
}