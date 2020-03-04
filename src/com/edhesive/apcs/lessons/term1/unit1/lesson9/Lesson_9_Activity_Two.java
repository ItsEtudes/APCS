/*
 * Lesson 9 Coding Activity Question 2
 *
 * Write the code to print a random integer from -20 to 20 inclusive using Math.random().
 *
*/
package com.edhesive.apcs.lessons.term1.unit1.lesson9;

import java.lang.Math;

class Lesson_9_Activity_Two {
    public static void main(String[] args) {
      
        /* Write your code here 
         * Copy and paste your entire code to Code Runner to complete the activity, 
         * from the first import statement to the last bracket. 
        */
        System.out.println((int)(Math.random() * 41) - 20);

    }
}