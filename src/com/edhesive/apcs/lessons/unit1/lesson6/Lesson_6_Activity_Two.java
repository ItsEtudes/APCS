/*
 * Lesson 6 Coding Activity Question 2
 *
 * Input a double value and print only the integer part.
 *
 * Sample run:
 
Please input a decimal number:
57.8934
Answer: 57

*/
package com.edhesive.apcs.lessons.unit1.lesson6;

import java.util.Scanner;

class Lesson_6_Activity_Two {
    public static void main(String[] args) {
      
        /* Write your code here 
         * Copy and paste your entire code to Code Runner to complete the activity, 
         * from the first import statement to the last bracket. 
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input a decimal number:");
        int value = (int) scan.nextDouble();
        System.out.println("Answer: " + value);

    }
}