package com.edhesive.apcs.lessons.unit2.lesson11;
/*
 * Lesson 11 Coding Activity 2
 * Test if a decimal value input from the keyboard is equal to 48.729.
 * If it is, print "YES" (without the quotes).
*/

import java.util.Scanner;
import java.lang.Math;


class Lesson_11_Activity_Two {   
    public static void main(String[] args) {
       /* Write your code here
        * Copy and paste your entire program to Code Runner to complete the activity,
        * from the first import statement to the last bracket.
        */
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter a decimal value:");
       double value = scan.nextDouble();
       if(value == 48.729) {
           System.out.println("YES");
       }
    }
}