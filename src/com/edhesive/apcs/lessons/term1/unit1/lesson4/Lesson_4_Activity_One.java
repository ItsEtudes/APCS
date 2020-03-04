/*
 * Lesson 4 Coding Activity Question 1
 * 
 * Input two doubles and print them backwards on the screen.
 *
 * So if the user enters:
 
 1.3 6.8
 
 * It should output:
 
 6.8 1.3
 
 * Notice there is exactly one space between the numbers.
*/
package com.edhesive.apcs.lessons.term1.unit1.lesson4;

import java.util.Scanner;

class Lesson_4_Activity_One {
    public static void main(String[] args) {

        /* Write your code here
         * Copy and paste your entire code to Code Runner to complete the activity,
         * from the first import statement to the last bracket.
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two decimal values");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        System.out.println(b + " " + a);
    }
}