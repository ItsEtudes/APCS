/*
 * Lesson 5 Coding Activity Question 2
 * 
 * Input four integer values and print the sum of all four values.
 *
*/

package com.edhesive.apcs.lessons.unit1.lesson5;

import java.util.Scanner;

class Lesson_5_Activity_Two {
    public static void main(String[] args) {
      
        /* Write your code here 
         * Copy and paste your entire code to Code Runner to complete the activity, 
         * from the first import statement to the last bracket. 
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter four integer values");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        System.out.println(a + b + c + d);

    }
}