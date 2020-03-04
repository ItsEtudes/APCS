/*
 * Lesson 5 Coding Activity Question 1
 * 
 * Input two double values and print the difference between them. 
 * (The difference can be found by subtracting the second value from the first).
 *
*/

package com.edhesive.apcs.lessons.term1.unit1.lesson5;

import java.util.Scanner;

class Lesson_5_Activity_One {
    public static void main(String[] args) {
      
        /* Write your code here 
         * Copy and paste your entire code to Code Runner to complete the activity, 
         * from the first import statement to the last bracket. 
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two decimal values");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        System.out.println(a - b);

    }
}