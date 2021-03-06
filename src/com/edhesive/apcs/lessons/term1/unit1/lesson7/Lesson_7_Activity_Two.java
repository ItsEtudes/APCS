/*
 * Lesson 7 Coding Activity Question 2
 *
 * Change the last problem so that it also prints the sum of the digits. 
 * Use the format shown below.
 *
 * Make sure your output is printed in the same order as the sample run.
 *
 * Sample run:
 
Please enter a three digit number:
678

Here are the digits:
6
7
8

6 + 7 + 8 = 21

*/
package com.edhesive.apcs.lessons.term1.unit1.lesson7;

import java.util.Scanner;

class Lesson_7_Activity_Two {
    public static void main(String[] args) {
      
        /* Write your code here 
         * Copy and paste your entire code to Code Runner to complete the activity, 
         * from the first import statement to the last bracket. 
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a three digit number:");
        int value = scan.nextInt();
        int ones = (value % 10);
        int tens = (value % 100) / 10;
        int hundreds = (value % 1000) / 100;
        System.out.println("Here are the digits\n" + hundreds + '\n' + tens + '\n' + ones + '\n');
        System.out.println(hundreds + " + " + tens + " + " + ones + " = " + (hundreds + tens + ones));

    }
}