package com.edhesive.apcs.lessons.unit1.lesson10;/*
 * Lesson 10 Coding Activity Question 1
 * 
 * The following calculation will give roundoff error:
 *      double x = 1.473;
 *      System.out.println(2 - x);
 * 
 * Write the code to correct it. You can assume no more than 3 decimal places will be used.
 * 
 * Sample run:
 * 
 *      Please enter two decimal values:
 *      2
 *      1.473
 *     
 *      The difference is: 0.527
 * 
 * Use this starter file as your template.
 * 
*/

import java.util.Scanner;


class Lesson_10_Activity {
    public static void main(String[] args) {
      
        /* Write your code here 
         * Copy and paste your entire code to Code Runner to complete the activity, 
         * from the first import statement to the last bracket. 
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter two decimal values:");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double result = (double)(((int) (a * 1000)) - ((int) (b * 1000))) / 1000;
        System.out.println("\nThe difference is: " + result);

    }
}