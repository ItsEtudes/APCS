/*
 * Lesson 6 Coding Activity Question 1
 
double x = (11+4)/2
 
 * What answer do you get? The answer is imprecise!
 *
 * Write a Java program that precisely calculates the average 
 * between two integers that input from the keyboard, and prints 
 * the answer to the screen. The average must include the integer 
 * and decimal portions of the calculation.
 *
 * Sample Run:
 
Please enter two integers:
4
11

The average is: 7.5

*/
package com.edhesive.apcs.lessons.unit1.lesson6;

import java.util.Scanner;

class Lesson_6_Activity_One {
    public static void main(String[] args) {
      
        /* Write your code here 
         * Copy and paste your entire code to Code Runner to complete the activity, 
         * from the first import statement to the last bracket. 
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter two integers:");
        int a = scan.nextInt();
        int b = scan.nextInt();
        double result = (double) (a + b) / 2;
        System.out.println("The average is: " + result);

    }
}