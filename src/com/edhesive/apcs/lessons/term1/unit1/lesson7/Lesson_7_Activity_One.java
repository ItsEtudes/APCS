/*
 * Lesson 7 Coding Activity Question 1
 *
 * Input a positive three digit integer. Print out the digits one per line.
 *
 * Sample run:
 
Please enter a three digit number:
678

Here are the digits:
6
7
8

*/
package com.edhesive.apcs.lessons.term1.unit1.lesson7;

import java.util.Scanner;

class Lesson_7_Activity_One {
    public static void main(String[] args) {
      
        /* Write your code here 
         * Copy and paste your entire code to Code Runner to complete the activity, 
         * from the first import statement to the last bracket. 
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a three digit number:");
        int value = scan.nextInt();
        int ones = value % 10;
        int tens = (value % 100) / 10;
        int hundreds = (value % 1000) / 100;

        System.out.println("Here are the digits:");
        System.out.println(hundreds);
        System.out.println(tens);
        System.out.println(ones);

    }
}